package Inheritance;
import java.util.Scanner;
import series.PrimeNumber;
public class MainClass 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two nos.: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Child obj=new Child(a,b);
        System.out.println("Addition: "+obj.add());
        System.out.println("Difference: "+obj.subtract());
        boolean b1=PrimeNumber.isPrime(obj.add());
        boolean b2=PrimeNumber.isPrime(obj.subtract());
        if(b1)
        {
            System.out.println("Added no. is a Prime!");
        }
        else
            System.out.println("Added number is not a Prime no.");
        if(b2)
        {
            System.out.println("Subtracted no. is a Prime!");
        }
        else
            System.out.println("Subtracted number is not a Prime no.");
    }
}
