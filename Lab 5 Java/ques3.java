import java.util.Scanner;
public class ques3 {
    public static void main(String args[])
    {
        int i,j,temp;
        int[] a;
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers of your choice");
        for(i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.printf("The sorted array is: ");
        for(i=0;i<10;i++)
        {
            System.out.printf("%d ",a[i]);
        }
    }
}
