package Keyword;

public class ThisDemo 
{
    public static void main(String ar[])
    {
        ThisA obj=new ThisA(24,96);
        obj.display();
    }
}
class ThisA
{
    private int i=50,j=22;      //this green color variable is instance variable
    public ThisA(int i,int x)   //this black color variable is local variable
    {
        System.out.println("Before: Value of i: "+i+" || Value of j: "+j);
        this.i=i;           //this.i represents current instance
        j=x;
    }
    public void display()
    {
        System.out.println("Value of i: "+i+" || Value of j: "+j);
    }
    
}
