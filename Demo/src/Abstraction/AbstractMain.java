package Abstraction;
import java.util.Scanner;

public class AbstractMain 
{
    public static void main(String ar[])
    {
        String userName,password;
        char c='y';
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter User-Name: ");
        userName=sc.next();
        System.out.print("Enter Password: ");
        password=sc.next();
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        AbstractImplementation obj=new AbstractImplementation();
        obj.setUserName(userName);
        obj.setPassword(password);
        obj.setID(id);
        while(c=='y'||c=='Y')
        {
            System.out.println("1. Login");
            System.out.println("2. Forget User-Name");
            System.out.println("3. Forget Password");
            System.out.print("Please enter an option: ");
            int i=sc.nextInt();
            switch(i)
            {
                case 1: System.out.print("Enter User-Name: ");
                        userName=sc.next();
                        System.out.print("Enter Password: ");
                        password=sc.next();
                        boolean b=obj.login(userName, password);
                        obj.show(b);
                        break;
                case 2: System.out.println("Enter your ID:");
                        id=sc.nextInt();
                        obj.userNameShow(id);
                        break;
                case 3: System.out.print("Enter User-Name: ");
                        userName=sc.next();
                        obj.passwordShow(userName);
                        break;
                default: System.out.println("Wrong option entered, Sucker!!!");
                         break;
            }
            System.out.print("Want to Play once more(y/n): ");
            String s=sc.next();
            c=s.charAt(0);
            if(c!='y'||c!='Y'||c!='n'||c!='N')
            {
                System.out.println("Wrong choice again sucker!!!");
                System.out.println("Exiting...");
            }
        }       
        obj.inAbstract();
    }   
}
