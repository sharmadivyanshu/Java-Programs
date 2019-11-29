package StringOperations;

//by default String is immutable but we can make it mutable by following two ways:
//StringBuffer and StringBuilder

public class StringMutable 
{
    public static void main(String[] args) 
    {
        String s1="This is String 1";
        String s2="This is String 2";
        StringBuffer str1 =new StringBuffer(s1);      //it is thread safe.
        System.out.println("Before--> "+str1);
        str1.append(" and we are appending it using StringBuffer");
        System.out.print("After--> "+str1);
        System.out.println("\n.\n.\n.\n.");
        StringBuilder str2=new StringBuilder(s2);       //it is not thread safe.
        System.out.println("Before--> "+str2);
        str2.append(" and we are appending it using StringBuilder");
        System.out.println("After--> "+str2);
    }
}
