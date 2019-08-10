package series;
import java.util.Scanner;
public class Palindrome 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0,reminder;
        while(temp>0)
        {
            reminder = temp%10;
            temp/=10;
            reverse = reverse*10+reminder;
        }
        if(n==reverse)
            System.out.println("Palindrome!");
        else
            System.out.println("Not a Palindrome!");       
    }   
}
