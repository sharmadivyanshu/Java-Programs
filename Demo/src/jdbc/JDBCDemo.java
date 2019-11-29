package jdbc;
import java.sql.*;
public class JDBCDemo 
{
    public static void main(String[] args) 
    {
        
       try
       {
           Class.forName("oracle.jdbc.driver.OracleDriver"); 
           Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Sharma","Password");
           Statement st=con.createStatement();
           boolean b=st.execute("create table demo_table (Name varchar2(20), Age integer, Sex varchar2(10))");
           if(!b)
           {
               String insert="insert into demo_table values('Divyanshu',24,'Male')";
               int i=st.executeUpdate(insert);
               if(i>0)
                   System.out.println("Inserted");
               else
                   System.out.println("not inserted");
           }

           String select="select * from demo_table";

           ResultSet rs=st.executeQuery(select);

           while(rs.next())
           {
               String name=rs.getString("Name");
               int age=rs.getInt("Age");
               String sex=rs.getString("Sex");
               System.out.println("Name: "+name+" Age: "+age+" Sex: "+sex);
           }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }   
    }    
}