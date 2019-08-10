package Keyword;

//final method demo:

public class FinalDemo2 
{
    public static void main(String ar[])
    {
        B obj=new B();
        obj.show();
    }
}
class A
{
    final public void show()                //final method
    {
        System.out.println("In A show()");
    }
}
class B extends A
{
//    public void show()                                
//    {
//        System.out.println("In B show()");
//    }
//final method cannot be overridden
}
