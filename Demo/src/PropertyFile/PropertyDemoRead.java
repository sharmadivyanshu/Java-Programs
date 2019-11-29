package PropertyFile;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyDemoRead
{
    public static void main(String[] args) throws Exception 
    {
        File f=new File("dataConfig.properties");
        Properties prop=new Properties();
        FileReader reader=new FileReader(f);
        prop.load(reader);
        prop.list(System.out);      //for printing out all the properties
        //for printing specific properties
        System.out.println("");
        System.out.println(prop.getProperty("Device_Name"));
    }   
}
