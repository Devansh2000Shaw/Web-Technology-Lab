class Base
{
    Base()
    {
        System.out.println("Derived constructor in super class");
    }
    Base(int x)
    {
        System.out.println("In base class paramaterised constructor the value of x is: "+x);
    }
};
class Derived extends Base
{
    Derived(int x, int y)
    {
        super(x);
        System.out.printf("In derived class paramaterised constructor the value of x and y is %d and %d respectively.",x,y);
    }
};
public class ques6 {
    public static void main(String args[])
    {
        Derived x = new Derived(4, 5);
    }
}
