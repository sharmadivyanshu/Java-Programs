package series;
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k=0,a=1,b=1;
        int i=1;
        System.out.print("1 1 ");
	while(i<=n-2)
        {
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
            i++;
        }
    }   
}
