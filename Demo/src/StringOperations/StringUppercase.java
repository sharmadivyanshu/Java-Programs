package StringOperations;

import java.util.Scanner;

public class StringUppercase 
{
    public static void main(String ar[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1. String: ");
        s1=sc.next();
        System.out.print("Enter 2. String: ");
        s2=sc.next();
        System.out.println("String 1. in Uppercase: "+s1.toUpperCase());
        System.out.println("String 2. in Uppercase: "+s2.toUpperCase());
    }
}
