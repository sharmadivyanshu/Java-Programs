package Cloning;


/*
There are 3 types of Object copying:
    1. Shallow
    2. Deep
    3. Cloning
*/

public class ObjectCloning implements Cloneable     //to use clone() we must implement Clonable interface which is a marker interface
{
    int i,j;
    String str;

    public ObjectCloning() 
    {
        
    }
    public ObjectCloning(int i, int j, String str) 
    {
        this.i = i;
        this.j = j;
        this.str = str;
    }

    @Override
    public String toString() {
        return "{" + "i=" + i + ", j=" + j + ", str=" + str + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //to clone the data.
    }
    
    
    
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ObjectCloning obj=new ObjectCloning(5,10,"Divyanshu");
        System.out.println("Object to be copied: "+obj.toString());
        System.out.println("");
        
        /*
          Giving the reference of obj to objShallow
          any change in any one will reflect on another
        */
        ObjectCloning objShallow= obj; 
        System.out.println("Shallow Copying: "+objShallow.toString());  
        
        /*
          Deep copying, every data of obj is copied to every data of objDeep.       
        */
        ObjectCloning objDeep=new ObjectCloning();
        objDeep.i=obj.i;
        objDeep.j=obj.j;
        objDeep.str=obj.str;
        System.out.println("");
        System.out.println("Deep Copying: "+objDeep.toString());
        
        /*
          Cloning,
        */
        ObjectCloning objClone=(ObjectCloning) obj.clone();
        System.out.println("");
        System.out.println("Cloning: "+objClone.toString());
    }
}
