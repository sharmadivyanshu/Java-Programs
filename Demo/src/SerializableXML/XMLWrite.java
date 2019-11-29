package SerializableXML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLWrite
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        List<UserData> list=new ArrayList<>();
        char ch='y';
        while(ch=='y'||ch=='Y')
        {
            UserData user=new UserData();
            System.out.print("Enter Name: ");
            user.setName(sc.next());
            System.out.print("Enter Sex: ");
            user.setSex(sc.next());
            System.out.print("Enter Age: ");
            user.setAge(sc.nextInt());
            list.add(user);
            System.out.print("Want to enter more Data? (y/n)");
            ch=sc.next().charAt(0);
        }
        Users users=new Users();
        users.setUserInfo(list);
        
        try (XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("users.xml")))) {
            xml.writeObject(users);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
