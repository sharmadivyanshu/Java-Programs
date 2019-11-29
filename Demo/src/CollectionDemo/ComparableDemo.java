package CollectionDemo;


//Comparable Interface makes a class self sorted i.e. we don't have to sort them using different logic
//for this we need to make some modifications to our initial class


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo 
{
    public static void main(String[] args) 
    {
        List<Student> list=new ArrayList<>();
        
        list.add(new Student(22, "Divyanshu"));
        list.add(new Student(55, "Saad"));
        list.add(new Student(59, "Shahrukh"));
        list.add(new Student(74, "Vivek"));
        list.add(new Student(54, "Rohit"));
        list.add(new Student(12,"Apoorv"));
        
        System.out.println("Orginal List -->");
        list.forEach(System.out::println);
        
        Collections.sort(list);
        System.out.println("After Sorting -->");
        list.forEach(System.out::println);
    }
}

class Student implements Comparable<Student>
{
    int rollNo;
    String name;

    public Student(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + '}';
    }
    
    @Override
    public int compareTo(Student stud) 
    {
        return this.rollNo>stud.rollNo?1:this.rollNo<stud.rollNo?-1:0;
    }
    
}