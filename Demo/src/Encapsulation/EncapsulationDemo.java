package Encapsulation;

public class EncapsulationDemo 
{
    public static void main(String ar[])
    {
        Employee e1=new Employee();
        e1.setEmployeeId(1413213022);
        e1.setEmployeeName("Divyanshu");
        Employee e2=new Employee();
        e2.setEmployeeId(1413213055);
        e2.setEmployeeName("Saad");
        System.out.println("Id: "+e1.getEmployeeId()+"\nName: "+e1.getEmployeeName());
        System.out.println("\nId: "+e2.getEmployeeId()+"\nName: "+e2.getEmployeeName());
    }
    
}
