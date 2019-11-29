package Enum;
import java.util.Scanner;

// Enums are used when we know all possible values at compile time, 
// It is not necessary that the set of constants in an enum type stay fixed for all time.
// Enum declaration can be done outside a Class or inside a Class but not inside a Method.

enum Rainbow        //enum outside the class
{
    //First line inside enum should be list of constants and then other things like methods, variables and constructor.
    //According to Java naming conventions, it is recommended that we name constant with all capital letters
    VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED;
    // enum constructor called separately for each 
    // constant
    private Rainbow()
    {
        System.out.println("Constructor called for : " + this.toString());
    }
    // Only concrete (not abstract) methods allowed 
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
}
enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 
public class EnumDemo 
{
    Day day; 

    public EnumDemo(Day day) {
        this.day = day;
    }
    public void dayIsLike() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Mondays are bad."); 
            break; 
        case FRIDAY: 
            System.out.println("Fridays are better."); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.println("Weekends are best."); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    } 
    public static void main(String[] args) 
    {
        Rainbow color=Rainbow.VIOLET;
        System.out.println(color);
        color.colorInfo();
        Rainbow colorArray[] = Rainbow.values();
        // enum with loop 
        for (Rainbow col : colorArray) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.println(col + " at index " + col.ordinal()); 
        } 
        System.out.print("Enter Day: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        EnumDemo e1 = new EnumDemo(Day.valueOf(str.toUpperCase())); 
        e1.dayIsLike();
    }
}
