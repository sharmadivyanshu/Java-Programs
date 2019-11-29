package InnerClass;

// #3. Anonymous Class


public class AnonymousClass
{
    int number;
    String text;

    public AnonymousClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
    
    public void display()
    {
        System.out.println("Number: "+number);
        System.out.println("Text: "+text);
    }
    
    public static void main(String[] args) 
    {
        AnonymousClass obj=new AnonymousClass(123, "AaBbCc");
        AnonymousClass obj1=new AnonymousClass(456,"DdEeFf")        // Anonymous Class, saved as AnonymousClass$1.class
        {
            @Override
            public void display()
            {
                System.out.println("Hello from Inside");
                System.out.println("Number: "+number);
                System.out.println("Text: "+text);
            }
        };
        obj.display();
        obj1.display();
        
        // Lambda expression, above java 8
        Example obj2=() -> System.out.println("Hello from Lambda Expression");      // This is not saved as a class in memory
        obj2.print();
    }
}

@FunctionalInterface
interface Example       // SAM - Single Abstract Method // Fuctional Interface
{
    public void print();
}
