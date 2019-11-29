package InnerClass;

// #2. Nested Class


public class NestedClassDemo 
{
    int number;
    String text;

    public NestedClassDemo(int number, String text) {
        this.number = number;
        this.text = text;
    }
    
    public void display()
    {
        System.out.println("Number: "+number);
        System.out.println("Text: "+text);
    }
    
    static class InnerClass
    {
        public void show()
        {
            System.out.println("Hello from Inside Class");
        }
    }
}

class StaticMain
{
    public static void main(String[] args) 
    {
        //Since InnerClass is static we can create the object without instantiating the NestedClassDemo
        NestedClassDemo obj=new NestedClassDemo(123, "AaBbCc");
        NestedClassDemo.InnerClass obj1=new NestedClassDemo.InnerClass();
        obj.display();
        obj1.show();
    }
}
