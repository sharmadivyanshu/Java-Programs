package StringOperations;

public class StringSplit 
{
    public static void main(String[] args)
    {
        String str="Divyanshu, Saad, Shahrukh, Shresth, Rohit, Vivek";
        System.out.println("String before: "+str);
        System.out.println("\n\nAfter Spliting-->");
        String s[]=str.split(", ");         //Spliting the String by ", " and putting it in a String type array
        for(String i:s)
        System.out.println(i);
    }
}
