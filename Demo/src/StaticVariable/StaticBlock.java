package StaticVariable;


public class StaticBlock 
{
    static String s="Hello!";             
    static       //Same for all the objects, it is executed when class is loaded.     //executed 1
    {
        System.out.println(s+" Static Block-1");
        System.out.println("Hello from Static Block-1");
    }
    
    public static void main(String ar[])  //executed after all the static is executed
    {
        System.out.println(s);
        System.out.println("Hello from Main");          
    }
    static      //Static block is executed first in sequence    //executed 2
    {
        System.out.println(s+" Static Block-2");
        System.out.println("Hello from Static Block-2");
    }
}
