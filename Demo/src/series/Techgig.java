package series;
import java.util.*;
public class Techgig
{
    public static void main(String args[] ) throws Exception 
    {
        int T,N,j=1;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        N=sc.nextInt();
        while(j<=T)
        {
            int next=1,prev=1,result;
            System.out.print(prev+" "+next+" ");
            for(int i=3;i<=N;i++)
            {
                if(i%2!=0)
                {
                    result=prev+next;
                    next=result;
                    System.out.print(result+" ");
                }
                else
                {
                    result=next/prev;
                    prev=result;
                    System.out.print(result+" ");
                }
            }
            System.out.println("");
            j++;
        }
    }
}