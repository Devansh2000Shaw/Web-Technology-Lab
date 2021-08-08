import java.util.Scanner;
import java.util.*;

class Account
{
    Scanner sc = new Scanner(System.in);
    int acc_no,balance;
    void input()
    {
        System.out.print("Enter the Account no.: ");
        acc_no = sc.nextInt();
        System.out.print("Enter the Balance: ");
        balance = sc.nextInt();
    }
    void disp()
    {
        System.out.println("Name: "+acc_no);
        System.out.println("Aadhar No.: "+balance);
    }
};
class Person extends Account
{
    Scanner sc = new Scanner(System.in);
    
    String name;
    int aadhar_no;
    void input()
    {
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.print("Enter the aadhar No.: ");
        aadhar_no = sc.nextInt();
    }
    void disp()
    {
        System.out.print("Name: "+name);
        System.out.println("Aadhar No.: "+name);
    }
}
public class ques5 {
    public static void main(String args[])
    {
        int i;
        Account x[] = new Account[5];
        Person y[] = new Person[5];
        for(i=0;i<5;i++)
        {
            x[i] = new Account();
            y[i] = new Person();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the details of Person : "+(i+1));
            y[i].input();
            x[i].input();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Details of Person are: "+(i+1));
            y[i].disp();
            x[i].disp();
        }
    }
}
