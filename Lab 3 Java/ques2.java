import java.util.Scanner;
public class ques2 
{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the student's marksin between 0 to 100: ");
            int marks = in.nextInt();
            if (marks >= 90) {
                System.out.println("O grade");
            }
            else if (marks>=80 && marks <=89) {
                System.out.println("E grade");
            }
            else if (marks>=70 && marks <=79) {
                System.out.println("A grade");
            }
            else if (marks>=60 && marks <=69) {
                System.out.println("B grade");
            }
            else if (marks>=50 && marks <=59) {
                System.out.println("C grade");
            }
            else if (marks>=40 && marks <=49) {
                System.out.println("D grade");
            }
            else {
                System.out.println("Fail");
            }

        }
    }
