package Abstraction;

public class AbstractImplementation extends AbstractDemo
{
    String userName;
    String password;
    int id;

    public void setUserName(String userName) {              //Setter
        this.userName = userName;
    }

    public void setPassword(String password) {              //Setter
        this.password = password;
    }

    public void setID(int id) {                             //Setter
        this.id = id;
    }
    
    
    @Override
    public boolean login(String x,String y)                 //Abstract Method
    {
        return x.compareToIgnoreCase(userName)==0 && y.compareTo(password)==0;
    }
    @Override
    public void show(boolean x)                             //Abstract Method
    {
        if(x)
        {
            System.out.println("User-Name: "+userName+"\nPassword: "+password);
            System.out.println("Login Successful");
        }
        else
            System.out.println("Invalid Credentials!");
    }
    public void userNameShow(int id)                        //Class Method
    {
        if(this.id==id)
            System.out.println("User-Name: "+userName);
        else
            System.out.println("Wrong ID, Sucker!!!");
    }
    public void passwordShow(String userName)               //Class Method
    {
        if(userName.compareToIgnoreCase(this.userName)==0)
            System.out.println("Password: "+password);
        else
            System.out.println("Wrong User-Name, Sucker!!!");
    }
}
