package Polymorphism;

public class MethodOverloading 
{
    public MethodOverloading()
    {
        System.out.println("In MethodOverloading");
    }
    public void show()
    {
        System.out.println("In Method Overloading Class");
    }
    public void show(int i)
    {
        System.out.println("In Method Overloading Class "+i);
    }
    public void show(float i)
    {
        System.out.println("In Method Overloading Class "+i);
    }
    public void show(int i,float j)
    {
        System.out.println("In Method Overloading Class " +i+" : "+j);
    }
}
