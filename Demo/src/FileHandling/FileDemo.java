package FileHandling;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileDemo 
{
    public static void main(String[] args) throws Exception 
    {
        File f=new File("FileDemo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Hello Java!");
        
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);
        
        FileInputStream fis1=new FileInputStream("abc.txt");
        int c;
        while((c=fis1.read())!=-1)
        {
            System.out.println((char)c);
        }
        
        Data obj=new Data();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Name: ");
        obj.setName(br.readLine());
        System.out.print("\nEnter Phone no.: ");
        obj.setPhoneNo(br.readLine());
        System.out.print("\nEnter E-mail Id: ");
        obj.seteMail(br.readLine());
        
        //Saving Object Data in a File Object.txt
        
        FileOutputStream fosNew=new FileOutputStream("Object.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fosNew); 
        oos.writeObject(obj);
        
        //Getting Object Data from a File Object.txt
        FileInputStream fisNew=new FileInputStream("Object.txt");
        ObjectInputStream ois=new ObjectInputStream(fisNew);
        Data objNew= (Data)ois.readObject();
        System.out.println("Name: "+objNew.getName());
        System.out.println("Phone No.: "+objNew.getPhoneNo());
        System.out.println("E-Mail Id: "+objNew.geteMail());
    }
}
class Data implements Serializable      //Serializable is used to give permission to write/fetch an object to/from a file. Serializable is a Marker Interface
{
    String Name;
    String phoneNo;
    String eMail;

    public String getName() {
        return Name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
}
