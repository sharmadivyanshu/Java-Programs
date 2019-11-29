package CollectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    Map Interface
    Map is a key,value pair
    We can implement Map interface by using HashMap, Hashtable, LinkedHashMap or TreeMap
    The only difference b/w HastMap and Hashtable is:
    HashMap is not Synchronized whereas Hashtable is Synchronized
    LinkedHashMap is used when we want to save the values in a sequential format i.e. maintaing the order
    TreeMap is used when we want to save the Map in a sorted format
    Key are a Set i.e. we cannot repeat the values or we can but the value will gets overwritten
    Value is a List i.e. we can have duplicate values.
*/
public class MapDemo 
{
    public static void main(String[] args) 
    {
        Map<String,String> map=new HashMap<>();         //in case of Generics we have to provide for both <Key,Value>
        map.put("firstName", "Divyanshu");//put(Key,Value) is used to add values in the Map             
        map.put("lastName", "Sharma");
        map.put("phoneNo","9560566011");
        map.put("sex","Male");
        map.put("age","24");
        
        System.out.println("Map: "+map);            //this will also not print the values in sequence because of hashing
        
        //to get a value from the Map we use get(Key) method
        System.out.println("\nPrinting one by one -->");
        System.out.println("First Name: "+map.get("firstName"));
        System.out.println("Last Name: "+map.get("lastName"));
        System.out.println("Phone No: "+map.get("phoneNo"));
        System.out.println("Sex: "+map.get("sex"));
        System.out.println("Age: "+map.get("age"));
        
        //to print all the values in the Map one by one
        /*
            for(String i:map.values())
            {
                System.out.println(i);
            }
            
            but this will only print values
        
            for(String i:map.keySet())
            {
                System.out.println(i);
            }
        
            & this will only print keys
        */
        
        /*
            If we want to print all the keys and the values one by one, we can use Set first to create a Set of keys
            and then use that Set to print the Keys and Values
        */
        
        Set<String> keySet=map.keySet();       //creating a set of keys
        
        System.out.println("");
        System.out.println("Printing using Set -->");
        for(String key: keySet)
        {
            System.out.println("Key: "+key+" | Value: "+map.get(key));
        }
        System.out.println("");
        
        /*
            there is another way of printing every key and value & that is by using Entry Interface
            Entry Interface is a Interface in the Map Interface i.e. Nested Interface
            Map.Entry interface in Java provides certain methods to access the entry in the Map. 
            By gaining access to the entry of the Map we can easily manipulate them. Map.Entry is a generic
        */
        Set<Map.Entry<String,String>> entry=map.entrySet();     
            //entrySet() is used to give every entry i.e. Key,Value pair from the map to the instance of entry
        System.out.println("Printing Using Entry Interface -->");
        for(Map.Entry<String, String> e: entry)
        {
            System.out.println("Key: "+e.getKey()+" | Value: "+e.getValue());
            //getKey() & getValue() are the methods of Entry Interface
        }
        
        System.out.println("\nChanging the value in the key -->");
        System.out.println("Previous Value -->"+map.put("firstName", "Ramakant"));
            //the value where the key is same will gets overwritten, this will return the previous value.
        System.out.println("New Value --> "+map.get("firstName"));
        System.out.println("");
        
        Map<Integer,String> newMap=new LinkedHashMap();     //LinkedHashMap
        newMap.put(3, "Divyanshu");
        newMap.put(1, "Papa");
        newMap.put(2, "Mummy");
        newMap.put(4, "Kirti");
                
        Set<Integer> newKeySet=newMap.keySet();       //creating a set of keys

        System.out.println("LinkedHashMap -->");
        for(int key: newKeySet)
        {
            System.out.println("Key: "+key+" | Value: "+newMap.get(key));
        }
        System.out.println("");
        
        Map<Integer,String> newMap1=new TreeMap();
        newMap1.put(3, "Divyanshu");
        newMap1.put(1, "Papa");
        newMap1.put(2, "Mummy");
        newMap1.put(4, "Kirti");
        
        Set<Integer> newKeySet1=newMap1.keySet();       //creating a set of keys

        System.out.println("TreeMap -->");
        for(int key: newKeySet1)
        {
            System.out.println("Key: "+key+" | Value: "+newMap1.get(key));
        }
        System.out.println("");
    }
}
