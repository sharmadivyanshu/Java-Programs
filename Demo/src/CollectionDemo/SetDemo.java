package CollectionDemo;

/*
    Set Interface
    Set can have only unique values
    Set is implemented using 2 Classes
    1. HashSet
    2. TreeSet
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo 
{
    public static void main(String[] args) 
    {
        Set<Integer> set=new HashSet<>();       //HashSet is used to implement Set Interface
        System.out.println("Value added: "+set.add(15));        //add() returns boolean value
        System.out.println("Value added: "+set.add(65));
        System.out.println("Value added: "+set.add(24));
        System.out.println("Value added: "+set.add(99));
        System.out.println("Value added: "+set.add(6));
        System.out.println("Value added: "+set.add(99));        //this will not be added to the set, duplicate values are not added

        System.out.println("\nSet = "+set);             //This will print the whole Set
        System.out.println("\nData in HashSet -->");
        set.forEach(System.out::println);       
        //in case of printing HastSet does not give values in sequence, nothing wrong with the Collection
        //HashSet use concept of hashing which does not save everything in a proper sequence
        //To save in a proper sequence we can use TreeSet
        //TreeSet saves everything in a ascending order by default.s
        
        Set<Integer> new_set=new TreeSet<>();           //TreeSet is used to implement Set Interface
        System.out.println("\nValue added: "+new_set.add(15));            //add() returns boolean value
        System.out.println("Value added: "+new_set.add(65));
        System.out.println("Value added: "+new_set.add(24));
        System.out.println("Value added: "+new_set.add(99));
        System.out.println("Value added: "+new_set.add(6));
        System.out.println("Value added: "+new_set.add(99));            //this will not be added to the set, duplicate values are not added
        
        System.out.println("\nNew Set = "+new_set);
        System.out.println("");
        System.out.println("Data in TreeSet -->");
        new_set.forEach(System.out::println); 
    }
}
