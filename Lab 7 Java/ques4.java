import java.util.Scanner;
import java.util.*;

class Shape{
    int area;
    void showArea()
    {
        System.out.println("\n");
    }
};
class circle extends Shape
{
    double areaCircle;
    void calculate(double r)
    {
        areaCircle = 3.14*r*r;
    }
    void display()
    {
        System.out.println("The area of the rectangle is: "+areaCircle);
    }
};
class rectangle extends Shape
{
    float areaRectangle;
    void calculate(float l, float b)
    {
        areaRectangle = l*b;
    }
    void display()
    {
        System.out.println("The area of the rectangle is: "+areaRectangle);
    }
};
public class ques4
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = s.nextFloat();
        System.out.print("Enter length of rectangle: ");
        float l = s.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float b = s.nextFloat();
        circle x = new circle();
        rectangle y = new rectangle();
        x.calculate(r);
        x.display();
        y.calculate(l, b);
        y.display();
    }
}

