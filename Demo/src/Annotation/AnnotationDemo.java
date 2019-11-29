package Annotation;

//Annotations are used to provide supplement information about a program.
//Annotations start with ‘@’.
//Annotations do not change action of a compiled program.
//Annotations help to associate metadata (information) to the program elements 
//i.e. instance variables, constructors, methods, classes, etc.
//Annotations are not pure comments as they can change the way a program is treated by compiler.

//There are 3 categories of Annotations:-
//1. Marker Annotations -> Example: - @TestAnnotation()
//2. Single value Annotations -> Example: - @TestAnnotation(“testing”);
//3. Full Annotations -> Example:- @TestAnnotation(owner=”Divyanshu”, value=”Predator”)

//Predefined/ Standard Annotations:

//Java defines seven built-in annotations
//Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
//Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings

//Creating Custom Annotation

//Marker Annotation
@interface SmartPhone       //to create custom Annotation
{
    
}

//Single value Annotation
@interface MobilePhone
{
    String os() default "IOS";
}

//Full Annotation
@interface Phone
{
    String os() default "IOS";
    double version() default 13.1;
}

@SmartPhone
class Nokia
{
    
}

@MobilePhone(os="IOS")     //either give a value for it will take the default
class Apple
{
    
}

@Phone(os="Android",version=10)     //either give a value for it will take the default
class Samsung
{
        
}

class A
{
    public void show()
    {
        System.out.println("In A");
    }
}
class B extends A
{
    @Override           //Annotation, it tells the complier what is going to be done
    public void show()
    {
        System.out.println("In B");
    }
}
public class AnnotationDemo 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        B obj1=new B();
        A obj2=new B();
        obj.show();
        obj1.show();
        obj2.show();       
    }
}
