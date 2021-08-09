import java.util.Scanner;
public class ques1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers of your choice: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c)
        {
            System.out.printf("%d is greatest",a);
        }
        else if( b > c && b > a)
        {
            System.out.printf("%d is greatest",b);
        }
        else
        {
            System.out.printf("%d is greatest",c);
        }
    }
}