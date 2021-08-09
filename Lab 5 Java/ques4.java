public class ques4 {
    static int count=0;
    ques4()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        ques4 obj1 = new ques4();
        ques4 obj2 = new ques4();
        ques4 obj3 = new ques4();
        ques4 obj4 = new ques4();
        System.out.println("Number of objects created:"+count);
    }
}

