package series;
import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b = isPrime(n);
        if(b)
            System.out.println("Prime no.");
        else
            System.out.println("Not a Prime no.");
    }
    public static boolean isPrime(int n)
    {
        int flag=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            flag++;
        }
        if(flag>1)
            return false;
        return true;
    }
    
}
