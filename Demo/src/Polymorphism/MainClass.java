package Polymorphism;
public class MainClass 
{
    public static void main(String ar[])
    {
        MethodOverloading obj1=new MethodOverloading();
        MethodOverriding obj2=new MethodOverriding();
        MethodOverloading obj3=new MethodOverriding();
        obj1.show();
        obj1.show(5.9f);
        obj1.show(22);
        obj1.show(5, 22.9f);
        obj2.show();
        obj2.show(45);
        obj2.show(14, 69.9f);
        obj3.show();
    }
}
