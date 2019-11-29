package series;
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
	int n = sc.nextInt();
	int k=0,a=0,b=1;
        int i=1;
        System.out.println("Fibonacci Series:");
        System.out.print(a+" "+b+" ");
	while(i<n)
        {
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
            i++;
        }
        System.out.println();
    }   
}
