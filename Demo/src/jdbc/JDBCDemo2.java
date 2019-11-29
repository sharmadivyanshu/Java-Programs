package jdbc;
import java.sql.*;      //package for JDBC  #1
import java.util.Scanner;

//JDBC is an acronym for Java Database Connectivity. It’s an advancement for ODBC ( Open Database Connectivity ). 
//JDBC is an standard API specification developed in order to move data from frontend to backend.
/*
    Steps in JDBC:
    1. Import the package
    2. Load and Register the Driver
            --> Driver for MySQL : com.mysql.jdbc.Driver
            --> Driver for Oracle : oracle.jdbc.driver.OracleDriver
    3. Establish the Connection
    4. Create the Statement
    5. Execute the Query
    6. Process Result
    7. Close the Connection and Statement
*/

public class JDBCDemo2 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        char ch='n';
        String firstName;
        String lastName;
        String relation;
        Long phoneNo;
        String name;
        int age;
        String sex;
        
        String url1="jdbc:mysql://127.0.0.1:3307/predator";
        String user1="Admin";
        String password1="Password@123";
        String url2="jdbc:oracle:thin:@localhost:1521:orcl";
        String user2="c##Sharma";
        String password2="Password";
        String query1="select * from Family";
        String query2="select * from demo_table";
        Class.forName("com.mysql.cj.jdbc.Driver");    //Driver Loading for MySQL    #2
        Class.forName("oracle.jdbc.driver.OracleDriver");   //Driver Loading for Oracle   #2
        //Class is a class
        Connection con1=DriverManager.getConnection(url1, user1, password1);    //Establishing Connection(MySQL)  #3
        Connection con2=DriverManager.getConnection(url2, user2, password2);    //Establishing Connection(Oracle)   #3
        //Connection is a Interface
        //DriverManager is a class
        //getConnection() is a method which returns a Connection value
        Statement st1=con1.createStatement();   //Creating the Statement(MySQL)    #4
        Statement st2=con2.createStatement();   //Creating the Statement(Oracle)    #4
        //Statement is a Interface
        
        System.out.print("Do you want to insert Data(y/n): ");
        ch=sc.next().charAt(0);
        while(ch=='y'||ch=='Y')
        {
            System.out.println("Insert Data in which Database?");
            System.out.println("1. MySQL");
            System.out.println("2. Oracle");
            System.out.println("3. Both");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.print("Enter First Name: ");
                        firstName=sc.next();
                        System.out.print("Enter Last Name: ");
                        lastName=sc.next();
                        System.out.print("Enter Relation: ");
                        relation=sc.next();
                        System.out.print("Enter Phone No: ");
                        phoneNo=sc.nextLong();
                        System.out.println("Inserting Values in the MySQL Database");
                        int count1=st1.executeUpdate("insert into Family values('"+firstName+"','"+lastName+"','"+relation+"',"+phoneNo+")");
                        System.out.println(count1+" row(s) affected");
                        break;
                case 2: System.out.print("Enter Name: ");
                        name=sc.next();
                        System.out.print("Enter Age: ");
                        age=sc.nextInt();
                        System.out.print("Enter Sex: ");
                        sex=sc.next();
                        System.out.println("Inserting Values in the Oracle Database");
                        int count2=st2.executeUpdate("insert into demo_table values('"+name+"',"+age+",'"+sex+"')");
                        System.out.println(count2+" row(s) affected");
                        break;
                case 3: System.out.print("Enter First Name: ");
                        firstName=sc.next();
                        System.out.print("Enter Last Name: ");
                        lastName=sc.next();
                        System.out.print("Enter Relation: ");
                        relation=sc.next();
                        System.out.print("Enter Phone No: ");
                        phoneNo=sc.nextLong();
                        System.out.print("Enter Name: ");
                        name=sc.next();
                        System.out.print("Enter Age: ");
                        age=sc.nextInt();
                        System.out.print("Enter Sex: ");
                        sex=sc.next();
                        System.out.println("Inserting Values in the MySQL Database");
                        count1=st1.executeUpdate("insert into Family values('"+firstName+"','"+lastName+"','"+relation+"',"+phoneNo+")");
                        System.out.println(count1+" row(s) affected");
                        System.out.println("Inserting Values in the Oracle Database");
                        count2=st2.executeUpdate("insert into demo_table values('"+name+"',"+age+",'"+sex+"')");
                        System.out.println(count2+" row(s) affected");
                        break;
                case 4: break;
                        
            }
            if(choice==4)
            {
                break;
            }
            System.out.print("Do you want to insert more data(y/n): ");
            ch=sc.next().charAt(0);
        }
        System.out.println("");        
        
        ResultSet rs1=st1.executeQuery(query1);     //Executing Queries(MySQL)  #5
        ResultSet rs2=st2.executeQuery(query2);     //Executing Queries(Oracle)  #5
        //ResultSet is a Interface
        //rs1 and rs2 acts as a dummy table
        //executeQuery() is used for DQL queries

        //Process Result    #6
        System.out.println("MySQL Data\n");
        while(rs1.next())
        {
            firstName=rs1.getString("First Name");
            lastName=rs1.getString("Last Name");
            relation=rs1.getString("Relation");
            phoneNo=rs1.getLong("Phone No");
            System.out.println("First Name: "+firstName);
            System.out.println("Last Name: "+lastName);
            System.out.println("Relation: "+relation);
            System.out.println("Phone No.: "+phoneNo);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Oracle Data\n");
        while(rs2.next())
        {
            name=rs2.getString("name");
            age=rs2.getInt("age");
            sex=rs2.getString("sex");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Sex: "+sex);
            System.out.println("");
        }
        
        //Close the Connection and Statement
        con1.close();
        con2.close();
        st1.close();
        st2.close();
    }
}
