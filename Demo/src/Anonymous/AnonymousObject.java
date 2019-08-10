package Anonymous;

public class AnonymousObject 
{
    int k;
    public void show()
    {
        System.out.println("Hello: "+k);
    }
    public static void main(String ar[])
    {
        AnonymousObject obj=new AnonymousObject();      //here AnonymousObject obj is a referenced object
        obj.k=25;
        obj.show();
        new AnonymousObject().k=29;         //Anonymous Object 1
        new AnonymousObject().show();       //Anonymous Object 2
    }
}
/* Anonymous Object aquires space in heap memory for ony one time,
   then when they were created again they again takes memory in heap,
   in above example the output of Anonymous Object will be a zero(0).
*/