package Keyword;

//final class demo:

public class FinalDemo3 
{
    public static void main(String ar[])
    {
        X obj1=new X();
        XY obj2=new XY();
        obj1.display();
        obj2.display();
    }
}
final class X           //cannot be inherited
{
    public void display()
    {
        System.out.println("Hello from X");
    }
}
class Y
{
    public void display()
    {
        System.out.println("Hello from Y");
    }
}
//class Z extends X             //cannot inherit a final class
//{
//    
//}

class XY extends Y
{
     public void display()
    {
        super.display();
        System.out.println("Hello from XY");
    }
}