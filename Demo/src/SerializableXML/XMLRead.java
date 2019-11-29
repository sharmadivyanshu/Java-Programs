package SerializableXML;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLRead 
{
    public static void main(String[] args)
    {
        try(XMLDecoder xml=new XMLDecoder(new BufferedInputStream(new FileInputStream("users.xml"))))
        {
            Users users=(Users)xml.readObject();
            List<UserData> list=users.getUserInfo();
            System.out.println("Data in the XML file -->\n");
            list.forEach((value) -> {
                System.out.println(value);
            });
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(XMLRead.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
