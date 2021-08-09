import java.util.Scanner;

public class ques4 {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int n=a%10;
        int x = a/100;
        if(n == x)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}