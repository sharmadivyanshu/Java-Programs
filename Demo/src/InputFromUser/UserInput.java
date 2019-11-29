package InputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("BufferedReader!");
        System.out.print("Enter a Number: ");
        InputStreamReader isr=new InputStreamReader(System.in);     //it takes the path from where the input will come
        BufferedReader br=new BufferedReader(isr);      //it takes a object of InputStreamReader
        //we can also do this //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());      //it is converting the string into integer format, it will throws an IOException
        System.out.print("Enter a String: ");
        String s=br.readLine();
        System.out.println("Entered no. is: "+i);
        System.out.println("Entered String is: "+s);
        
        System.out.println("\n\nScanner Class!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number=sc.nextInt();
        System.out.print("Enter a String: ");
        String string=sc.next();
        System.out.println("Entered no. is: "+number);
        System.out.println("Entered String is: "+string);
    }
}
