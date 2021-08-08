import java.util.Scanner;
import java.util.*;

class A
{
    void display()
    {
        System.out.println("In claas A");
    }
};
class B extends A
{
    void display()
    {
        System.out.println("In claas B");
    }
};
class C extends B
{
    void display()
    {
        System.out.println("In claas C");
    }
};
public class ques3 {
    public static void main(String args[])
    {
        A x; // reference object of super class which can point to object sub class but reverse is not true
        B y = new B();
        C z = new C(); // actual object
        z.display();
        x = y; // since object of super class points to B now if we want to print anything then it will print from class B
        x.display();
    }
}
