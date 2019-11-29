package ReflectionAPI;
import java.lang.reflect.Method;

/*-->Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime. 
  -->The required classes for reflection are provided under java.lang.reflect package.
  -->Reflection gives us information about the class to which an object belongs and also the methods of that class
     which can be executed by using the object.
  -->Through reflection we can invoke methods at runtime irrespective of the access specifier used with them
*/
public class ReflectionDemo 
{
    public static void main(String[] args) throws Exception
    {
        Class c=Class.forName("ReflectionAPI.DemoPrivate");
        DemoPrivate dp=(DemoPrivate)c.newInstance();
        
        Method m=c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(dp, null);
    }
}
