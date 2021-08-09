import java.util.Scanner;
import java.util.*;

public class ques3
{
    public static void main(String args[])
    {
        try
        {
            int a = 25/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block is executed.");
        }

    }
}