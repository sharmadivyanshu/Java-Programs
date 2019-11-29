package StringOperations;

import java.util.Scanner;

public class StringConcatenate 
{
    public static void main(String ar[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1. String: ");
        s1=sc.next();
        System.out.print("Enter 2. String: ");
        s2=sc.next();
        String s=s1.concat(" "+s2);     //we can also use s1+s2+"<any String>";
        System.out.println("Concatenated String: "+s);
    }
}
