package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDemo 
{
    public  static void main(String ar[]) throws Exception
    {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
        {
            String str= "";            
            str = br.readLine();
        }         
    }
    
}
