package Polymorphism;
public class MethodOverriding extends MethodOverloading
{
    public MethodOverriding()
    {
        System.out.println("In MethodOverriding");
    }
    @Override
    public void show()
    {
        System.out.println("In Method Overriding Class");
    }
    @Override
    public void show(int i)
    {
        System.out.println("In Method Overriding Class "+i);
    }
}
