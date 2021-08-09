import java.util.Scanner;
import java.util.*;

class Parent
{
    void msg()throws Exception
    {
        System.out.println("Parent");
    }
}
public class ques2 extends Parent{
    void msg()throws ArithmeticException
    {
        System.out.println("Child");
    }
    public static void main(String args[])
    {
        Parent x = new ques2();
        try
        {
            x.msg();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
        
    }
}
