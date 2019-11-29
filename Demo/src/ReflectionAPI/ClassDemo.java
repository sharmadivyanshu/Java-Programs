package ReflectionAPI;

//we have a clas named Class

public class ClassDemo 
{
    public static void main(String[] args) throws Exception
    {
        Class oldC=Class.forName("ReflectionAPI.A");
        Class newC=Class.forName("ReflectionAPI.B");
        System.out.println("A is an Interface true(yes)/false(no): "+oldC.isInterface());
        System.out.println("B is an Interface true(yes)/false(no): "+newC.isInterface());
        System.out.println("Super Class of A: "+oldC.getSuperclass());
        System.out.println("Super Class of B: "+newC.getSuperclass());
    }
}

class A
{
    String data;
}

interface B
{
    final String DATA="";
}