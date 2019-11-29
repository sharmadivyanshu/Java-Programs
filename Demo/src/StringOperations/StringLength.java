package StringOperations;
import java.util.Scanner;

public class StringLength 
{
    public static void main(String ar[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1. String: ");
        s1=sc.next();
        System.out.print("Enter 2. String: ");
        s2=sc.next();
        System.out.println("Length of 1. String: "+s1.length());
        System.out.println("Length of 2. String: "+s2.length());
    }
}
