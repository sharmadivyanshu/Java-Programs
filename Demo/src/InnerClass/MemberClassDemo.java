package InnerClass;

// #1. Member Class


public class MemberClassDemo 
{
    int number;                 //data members of the class MemberClassDemo
    String text;

    public MemberClassDemo(int number, String text)         //Constructor of MemberClassDemo
    {
        this.number = number;
        this.text = text;
    }
    
    public void display()
    {
        System.out.println("Number: "+number);
        System.out.println("Text: "+text);
    }
    
    class InsideClass                   //Inside class i.e. member class    // This class will be saved as MemberClassDemo$InsideClass.class
    {
        public void show()              //member function of class InsideClass
        {
            System.out.println("Hello from Inside");
        }
    }
     
}

class Main
{
    public static void main(String[] args) 
    {
        MemberClassDemo obj=new MemberClassDemo(123, "AaBbCc");
        
        // InsideClass obj1=new InsideClass()   -->     This will throw an error as InsideClass is a member of MemberClassDemo
        // so to instantiate the InsideClass we have to create a object of the MemberClassDemo first
        // and from the object of MemberClassDemo we can instantiate InsideClass
        
        MemberClassDemo.InsideClass obj1=obj.new InsideClass(); 
        obj.display();
        obj1.show();
    }
}