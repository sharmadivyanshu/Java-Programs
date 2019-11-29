package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> list=new ArrayList<>();         //list of type Integer
        
        list.add(27);
        list.add(07);
        list.add(1995);
        list.add(13);
        list.add(1991);
        
        System.out.println("ArrayList Before:");
        for(Integer val:list)
        {
            System.out.println("--> "+val);
        }
        list.add(4, 01);              //add an element at index 4 of the list
        
        System.out.println("ArrayList Before:");
        list.forEach(System.out::println);      //to print the elements of the list, java 1.8 or above, Stream API
        
        System.out.println("After sorting:");
        Collections.sort(list);                 //Collections is a class, sort() is a method to sort the collection in Ascending Order
        list.forEach(System.out::println);
        
        System.out.println("In Reverse:");
        Collections.reverse(list);              //reverse() is used to reverse the order of the list
        list.forEach(System.out::println);
    }
}
