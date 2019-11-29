package Interface;

interface MarkerInterface
{
    /*interface which does not have any declaration are called Marker Interface,
      they are used to give permissions etc
    */
}
public class MarkerDemo implements MarkerInterface
{
    void show()
    {
        System.out.println("Hello from MarkerDemo");
    }
    
    public static void main(String ar[])
    {
        MarkerDemo obj=new MarkerDemo();
        NotMarker obj1=new NotMarker();
        if(obj instanceof MarkerInterface)          //to check if MarkerDemo implements MarkerInterface
            obj.show();
        else
            System.out.println("Not Permitted!!!");
        
        if(obj1 instanceof MarkerInterface)
            obj1.show();
        else
            System.out.println("Not Permitted!!!");
    }
}
class NotMarker
{
    void show()
    {
        System.out.println("Hello from NotMarker");
    }
}
