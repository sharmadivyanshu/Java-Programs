package PropertyFile;

//Property File

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

public class PropertyDemoWrite 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("dataConfig.properties");
        Properties prop=new Properties();
        FileWriter write=new FileWriter(f);
        prop.setProperty("Device_Name", "Predator");
        prop.setProperty("User", "sharma");
        prop.setProperty("Password", "281293");
        prop.store(write, "Device Information");
        
    }
}
