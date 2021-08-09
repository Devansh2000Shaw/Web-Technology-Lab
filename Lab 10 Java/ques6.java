import java.util.Scanner;
import java.util.*;

class CheckArgument extends Exception
{
    CheckArgument(String s)
    {
        super(s);
    }
};
public class ques6 {
    static void argument() throws CheckArgument
    {
        int i,b=0,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        if(n<4)
        {
            throw new CheckArgument("Argument is less than 4");
        }
        else
        {
            for(i=0;i<4;i++)
            {
                b = b + a[i]*a[i];
            }
            System.out.println("Summation of squares of all 4 elements is: "+b);
        }
    }
    public static void main(String args[])  
    {
        try
        {
            argument();
        }
        catch(Exception e)
        {
            System.out.print("Exception occured");
        }
    }
}
