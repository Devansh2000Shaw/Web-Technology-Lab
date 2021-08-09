import java.util.Scanner;
public class ques6 {
    public static void main(String args[])
    {
        int i,j,m=0;
        int[][] a;
        a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("%d  ",a[i][j]);
            }
            System.out.printf("\n");
        }
        // Elements of right diagonal
        System.out.printf("The elements of right diagonal: \n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.printf("%d",a[i][j]);
                }
            }
        }
        System.out.printf("\n");
        // Elements of left diagonal
        System.out.printf("The elements of left diagonal: \n");
        for(i=0;i<3;i++)
        {
            m=m-1;
            for(j=0;j<3;j++)
            {
                if((i+j)==2)
                {
                    System.out.printf("%d",a[i][j]);
                }
            }
        }
    }
}
