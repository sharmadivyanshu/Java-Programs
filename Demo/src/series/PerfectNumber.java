package series;
import java.util.Scanner;
public class PerfectNumber 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b = isPerfect(n);
        if(b)
            System.out.println("Perfect no.");
        else
            System.out.println("Not a Perfect no.");
    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum = sum + i;
        }
        if(n==sum)
            return true;
        return false;
    }
    
}
