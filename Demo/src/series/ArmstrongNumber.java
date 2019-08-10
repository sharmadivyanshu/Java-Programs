package series;
import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b = isArmstrong(n);
        if(b)
            System.out.println("Armstrong no.");
        else
            System.out.println("Not a Armstrong no.");
    }
    public static boolean isArmstrong(int n)
    {
        int temp = n;
        int sum=0,reminder;
        while(temp>0)
        {
            reminder = temp%10;
            sum+= reminder*reminder*reminder;
            temp/=10;
        }
        if(n==sum)
            return true;
        return false;
    }
    
}
