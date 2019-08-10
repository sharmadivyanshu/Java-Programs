package Inheritance;

//super keyword as a object:

public class SuperDemo2 
{
    public static void main(String ar[])
    {
        Y obj=new Y();
        obj.show();
        System.out.println("");
        obj.display();
    }
}
class X
{
    int i=5;
    public void show()
    {
        System.out.println(i);
    }
    public void display()
    {
        System.out.println("In X");
    }
}
class Y extends X
{
    int i=4;
    public void show()
    {
        System.out.println(i);
        System.out.println(super.i);        //this super is the object of parent class
    }
    public void display()
    {
        super.display();        //this super is the object of parent class
        System.out.println("In Y");
    }
}
