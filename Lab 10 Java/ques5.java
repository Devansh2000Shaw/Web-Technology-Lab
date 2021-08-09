import java.util.Scanner;

class HrsException extends Exception
{
    HrsException(String s)
    {
        super(s);
    }
};
class MinException extends Exception
{
    MinException(String s)
    {
        super(s);
    }
};
class SecException extends Exception
{
    SecException(String s)
    {
        super(s);
    }
};
public class ques5 
{
        static void Hours(int hr) throws HrsException
        {
            if(hr<0 || hr>24)
            {
                throw new HrsException("Hours is not valid");
            }
            else
            System.out.println("Hours: "+hr);
        }
        static void Minutes(int min) throws MinException
        {
            if(min<0 || min>60)
            {
                throw new MinException("Minutes is not valid");
            }
            else
            System.out.println("Minutes: "+min);
        }
        static void Seconds(int sec) throws SecException
        {
            if(sec<0 || sec>60)
            {
                throw new SecException("Hours is not valid");
            }
            else
            System.out.println("Seconds: "+sec);
        }
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the Hours: ");
            int hr = s.nextInt();
            System.out.print("Enter the Minutes: ");
            int min = s.nextInt();
            System.out.print("Enter the Seconds: ");
            int sec = s.nextInt();
            try
            {
                Hours(hr);
                Minutes(min);
                Seconds(sec);
            }
            catch(Exception e)
            {
                System.out.println("Exception Occured: "+e);
            }
        }
}
