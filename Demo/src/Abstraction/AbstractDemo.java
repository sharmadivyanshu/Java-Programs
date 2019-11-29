package Abstraction;

public abstract class AbstractDemo              //Abstract Class
{
    public void inAbstract()
    {
        System.out.println("Bye from Abstract Class");
    }
    public abstract boolean login(String x ,String y);          //Abstract Method
    public abstract void show(boolean x);                       //Abstract Method
}