package CollectionDemo;

//Comparator is a Interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//we use Comparator when we want to sort the List on our own logic

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> list=new ArrayList<>();
        list.add(1051);
        list.add(4867);
        list.add(9594);
        list.add(6375);
        list.add(8111);
        
        System.out.println("Original List-->");
        list.forEach(System.out::println);
        
        Collections.sort(list);         //this will sort the list in ascending order
        System.out.println("After Sorting-->");
        list.forEach(System.out::println);
        
        //what if we want to use our own logic for sorting the elements
        //for that we use Comparator
        
        Comparator<Integer> c=(o1,o2) -> o1%10>o2%10?1:-1;      //Lambda-expression
        Collections.sort(list, c);
        System.out.println("After Using Comparator-->");
        list.forEach(System.out::println);
        
        //or we can make a object of a class which implements Comparator
        //Comparator<Integer> c=new CompImpl<>();
        //Collections.sort(list,c);
        
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(22, "Divyanshu"));
        emp.add(new Employee(55, "Saad"));
        emp.add(new Employee(59, "Shahrukh"));
        emp.add(new Employee(74, "Vivek"));
        emp.add(new Employee(54, "Rohit"));
        emp.add(new Employee(12, "Honey"));
        
        emp.forEach(System.out::println);
        
        Collections.sort(emp, new SortByID());
        System.out.println("After sorting by ID -->");        
        emp.forEach(System.out::println);
        
        Collections.sort(emp, new SortByName());
        System.out.println("After sorting by Name -->");        
        emp.forEach(System.out::println);
    }
}

class CompImpl implements Comparator<Integer>       //class implementing Comparator Interface
{
    @Override
    public int compare(Integer o1,Integer o2)       //returns -1,1 or 0 ; false,true or equals
    {
        if(o1>o2)
            return 1;
        return -1;
    }
}

class Employee
{
    int id;
    String name;

    public Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name=" + name + '}';
    }
}

class SortByID implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) 
    { 
        return emp1.id - emp2.id; 
    } 
}

class SortByName implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) 
    { 
        return emp1.name.compareTo(emp2.name); 
    } 
}