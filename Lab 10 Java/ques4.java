import java.util.Scanner;

class NegativeNumberException extends Exception
{
    NegativeNumberException(String s)
    {
        super(s);
    }
};
public class ques4 {

      static void processInput(int n) throws NegativeNumberException
        {
            if(n<0)
            {
                throw new NegativeNumberException("Negative Number");
            }
            else
            System.out.println("It's a positive number.");
        }
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number to check: ");
            int n = s.nextInt();
            try
            {
                processInput(n);
            }
            catch(Exception e)
            {
                System.out.println("Exception Occured: "+e);
            }
        }
}
