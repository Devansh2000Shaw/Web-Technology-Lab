import java.util.Scanner;
import java.util.*;

class sheet
{
    int l,b;
    Scanner sc = new Scanner(System.in);
    void priceSheet()
    {
        System.out.print("Enter the length and breadth of the sheet: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Cost of sheet is Rs 40 per sq.ft");
        System.out.println("Total price of the plastic for sheet: "+40*l*b);
    }

};
class box extends sheet
{
    int a;
    void priceBox()
    {
        System.out.print("Enter the length of each side of box: ");
        a = sc.nextInt();
        System.out.println("Cost of sheet is Rs 60 per cubic feet");
        System.out.println("Total price of the plastic for box : "+60*a*a*a);
    }
};
public class ques1
{
    public static void main(String args[])
    {
        box x = new box();
        x.priceBox();
        x.priceSheet();
    }
}