import java.util.Scanner;
import java.util.*;

class LessBalanceException extends Exception
{
    LessBalanceException(String s)
    {
        super(s);
    }
};

public class ques7 {
    static void minimum_balance()
        {
            System.out.println("500 is the minimum balance to create account.");
        }
    static void deposit_amount(int dep_amt)
        {
            System.out.println("Deposited amount is : "+dep_amt);
        }
        static void withdraw_amount(int wd_amt, int dep_amt) throws LessBalanceException
        {
            if(wd_amt>dep_amt + 500) // Since account already has 500 rupees which is deposited at the time of opening account
            {
                throw new LessBalanceException("Withdraw amount is not valid");
            }
            else
            System.out.println("Withdrawal amount is: "+wd_amt);
        }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        int dep_amt = s.nextInt();
        System.out.print("Enter the withdrawal amount: ");
        int wd_amt = s.nextInt();
        try
        {
            minimum_balance();
            deposit_amount(dep_amt);
            withdraw_amount(wd_amt, dep_amt);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
