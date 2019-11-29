package Interface;
/* Three types of interfaces:
    Marker Interface -> without any method
    SAM (Single Abstract Method) -> only have one method //also called as functional interface in java 1.8 it uses Lambda Expression
    Normal
*/
//interface cannot be instantiated and the methods in interface cannot have a body but only a declaration
interface InterfaceDemo         //interface 1
{
    void show();                //abstract method by default
    default void interfaceFunc()        //we can define a method inside a interface by using the default keyword before the funtion declaration
    {
        System.out.println("Inside Interface Default method");
    }
    static void print()
    {
        System.out.println("Inside Interface Static method");
    }
}
interface InterfaceDemo2 extends InterfaceDemo       //interface 2
{
    @Override
    void show();                //abstract method
}
//class implements interface
//interface extends interface
//class extends class
class InterfaceImplement implements InterfaceDemo,InterfaceDemo2   //multiple inheritance
{
    @Override
    public void show()
    {
        System.out.println("Hello! from show()");
    }
    public void display()
    {
        System.out.println("Hello! form display()");
    }
}

public class main
{
    public static void main(String ar[])
    {
        InterfaceDemo obj=new InterfaceImplement();
        obj.show();
        //obj.display(); will not work because the object of parent cannot access the members of child
        InterfaceImplement obj1=new InterfaceImplement();
        obj1.show();
        obj1.display();     //now this will work cuz the object of child is accessing the member of child
        InterfaceDemo obj2=new InterfaceDemo()
        {
            @Override
            public void show()
            {
                System.out.println("Hello! from Anonymous Inner Class");
            }
        };
        obj2.show();
        InterfaceDemo obj3=() ->            //Lambda Expression new in java 1.8
        {
            System.out.println("Hello! from Anonymous class //using Lambda Expression");
        };
        InterfaceDemo obj4=() -> System.out.println("Hello! from Anonymous class //using Lambda Expression in one line");
        obj3.show();
        obj4.show();
        obj.interfaceFunc();        //calling default method in interface
        InterfaceDemo.print();      //calling static method in inteface
    }
    
}