//To count no. of objects created!

package StaticVariable;
import java.util.Scanner;
public class StaticDemo 
{
    static int i;
    public StaticDemo()
    {
        i++;
    }
    public static void counter()
    {
        System.out.println("Total object created: "+i+"!!!");
    }
    
    
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total no. of objects you want to create: ");
        int n=sc.nextInt();
        int j=0;
        while(j<n)
        {
            StaticDemo obj = new StaticDemo();
            j++;
        }
        StaticDemo.counter();
    }
}
