abstract class sample
{
    abstract public void display1(int x,int y) ;
    abstract public void display2(int x,int y,int z);
    abstract public void display3(String a,String b,String c);
}
class sample1 extends sample
{
    public void display1(int a, int b)
    {
        System.out.println(a*b);
    }
    public void display2(int c, int d, int e)
    {
        System.out.println(c*d-e);
    }
    public void display3(String d, String e, String f)
    {
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

public class abstractdeclare {
    public static void main(String args[])
    {
        sample1 ob= new sample1();
        ob.display1(5,6);
        ob.display2(10,6,20);
        ob.display3("Car","Bus","Truck");
    }
}
