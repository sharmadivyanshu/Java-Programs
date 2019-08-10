package Inheritance;
public class Child extends Parent
{
    public Child(int a,int b)
    {
        this.a=a;       //both super and this works here
        this.b=b;
    }
    public int subtract()
    {
        int difference = a-b;
        return difference;
    }    
}
