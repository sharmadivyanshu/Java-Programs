package Inheritance;

//super keyword as a method:

public class SuperDemo 
{
    public static void main(String ar[])
    {
        A obj1=new A();
        System.out.println("");
        B obj2=new B();
        System.out.println("");
        A obj3=new B();
        System.out.println("");
        A obj4=new A(10);
        System.out.println("");
        B obj5=new B(20);
        System.out.println("");
        A obj6=new B();
        System.out.println("");
        A obj7=new B(30);
        System.out.println("");
    }
}
class A     //Super class
{
    int i=5;
    public A()
    {
        /*By default a super() is here which will call the default constructer of parent class of A 
            & in java every class extends Object Class*/
        
        System.out.println("In A || Value: "+i);
    }
    public A(int i)
    {
        this.i=i;
        System.out.println("In A || Value: "+i);
    }
}
class B extends A       //Sub class
{
    public B()
    {
        //By default a super() is here which will call the default constructer of parent of B i.e. A
        System.out.println("In B || Value: "+i);
    }
    public B(int i)
    {
        //here super() is also present which will call the default constructer of parent of B i.e. A
        this.i=i;
        System.out.println("In B || Value: "+i);
    }
    
}
