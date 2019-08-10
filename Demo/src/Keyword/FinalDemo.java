package Keyword;

//final variable demo:

public class FinalDemo 
{
    public static void main(String ar[])
    {
        int i=5;
        final int j=10,k;
        i++;
        //j++ will give a error because the value of final variables cannot change
        k=20;       //this will work because k was never initialised and value before
        //k++ will not work but gives a compile time error because of the same reason
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        
    }
}
