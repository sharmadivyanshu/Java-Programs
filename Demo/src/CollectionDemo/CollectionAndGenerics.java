package CollectionDemo;

//Collection and Generics
//Dynamic
//Generics always contains Classes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;        //to implement Collection 
import java.util.Iterator;


public class CollectionAndGenerics 
{
    public static void main(String[] args) 
    {
        int array[]=new int[10];                    //Integer Type array
        Object array_new[]=new Object[10];          //Object Type array
        for(int i=0;i<10;i++)
        {
            array[i]=i+20;
        }
        System.out.println("Integer Array values: "+Arrays.toString(array));        //to print all the values of the array
        System.out.println("");
        
        array_new[0]="Divyanshu";
        array_new[1]="Sharma";
        array_new[2]=24;
        System.out.println("Object Array Values: "+Arrays.toString(array_new));
        System.out.println("");
        
        //In arrays we have a specific no. of elements, but what if we don't know about the no. of elements
        //for that we use Collections
        //collection is a frame work
        //Collection is a Interface in java
        //Collections is a class in java
        
        Collection group=new ArrayList();       //creating a collection, it can contain data of any type
        group.add("Divyanshu");                 //add() is a method used to add items in the collection
        group.add("Sharma");
        group.add(9560566011L);
        group.add(24);
        
        //for printing the values of the collections
        
        //1. we can use Iterator
        Iterator i=group.iterator();
        System.out.println("Using Iterator Interface");
        
        while(i.hasNext())                      //hasNext() checks if there is a next element available returns boolean value
        {
            System.out.println("Collection value: "+i.next());       //next() fetches the value
        }
        
        System.out.println("");
        
        System.out.println("Using Enhanced for loop");
        //2. enhanced for loop
        for(Object val:group)
        {
            System.out.println("Collection values: "+val);
        }
        
        //Suppose we want to make a collection of a specific type i.e. Integer or String
        //for that we use generics
        //to use generics we have to mention <TYPE> after Collection but the TYPE should be Boxed Type
        
        Collection<Integer> group_new=new ArrayList<Integer>();         //collection of type Integer
        
        group_new.add(27);
        group_new.add(07);
        group_new.add(1995);
        //group_new.add("D.O.B.");  this will give a error now since it can only take Integer values
        
        System.out.println("");
        
        System.out.println("Using Generics");
        for(Integer val:group_new)                         //we can also use int in place of Integer
        {
            System.out.println("Collection values: "+val);
        }
        
        group_new.remove(07);
        
        System.out.println("");
        
        System.out.println("After Removing");
        for(Integer val:group_new)                         //we can also use int in place of Integer
        {
            System.out.println("Collection values: "+val);
        }
        
        //the elements are added after on another, so we cannot add an element in between
        //for that we have to use List Interface
    }
}
