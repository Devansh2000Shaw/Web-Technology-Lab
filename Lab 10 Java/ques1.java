import java.util.Scanner;
import java.util.*;

public class ques1 {
    public static void main(String args[])
    {
        try
        {
            int a = 35/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured: "+e);
        }
        System.out.println("Try catch block ran successfully.");
    }
}
