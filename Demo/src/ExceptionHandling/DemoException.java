package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DemoException 
{
    public static void main(String ar[])
    {
        int i,j=1,k=0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=5;
        try
        {
            System.out.println("Enter a Number:");
            j=Integer.parseInt(br.readLine());            
            k=i+j;
            System.out.println("Output is : " +k); 
            if(k<10)
            {
                throw new ArithmeticException();
            }
        }
        catch(IOException e)
        {
            System.out.println("Some IO Error");
        }        
        catch(ArithmeticException e)
        {
            System.out.println("Mimimum value for output is 10!!!");
        }
        catch(Exception e)
        {
            System.out.println("Unknown Exception");
        }
        finally
        {
            System.out.println("BYE!!!");
        }
        
    }
}
