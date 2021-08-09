import java.util.Scanner;
public class ques2 {
    public static void main(String args[])
    {
        int i,evenNum = 0,oddNum = 0;
        int[] a; // declaring an array of integers
        a = new int[10]; // allocating memory for 10 integers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers of your choice");
        for(i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i] % 2 == 0)
            {
                evenNum++;
                System.out.printf("%d is even\n",a[i]);
            }
            else
            {
                oddNum++;
                System.out.printf("%d is odd\n",a[i]);
            }
        }
        System.out.printf("There are %d even numbers\n",evenNum);
        System.out.printf("There are %d odd numbers\n",oddNum);
    }
}
