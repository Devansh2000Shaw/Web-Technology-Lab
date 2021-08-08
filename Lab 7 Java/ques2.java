class Plate
{
    float l,w;
    Plate()
    {
        System.out.println("Derived constructor in super class");
    }
    Plate(float l,float w)
    {
        System.out.println("Constructor in Plate");
        System.out.println("Length :"+l);
        System.out.println("Length :"+w);
    }
};
class Box extends Plate
{
    float l,w,h;
    Box(float l,float w,float h)
    {
        super(l,w);
        System.out.println("Constructor in Box");
        System.out.println("Length :"+l);
        System.out.println("Length :"+w);
        System.out.println("Length :"+h);
    }
};
class Woodbox extends Box
{
    float l,w,h,t;
    Woodbox(float l,float w,float h, float t)
    {
        super(l,w,h);
        System.out.println("Constructor in Woodbox");
        System.out.println("Length :"+l);
        System.out.println("Length :"+w);
        System.out.println("Length :"+h);
        System.out.println("Length :"+t);
    }

}
public class ques2 {
    public static void main(String args[])
    {
        Woodbox x = new Woodbox(4,5,6,7);

    }
}
