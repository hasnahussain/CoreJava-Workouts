package CURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDApp
{
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
//      System.out.println("Please enter name");
//      String name=sc.next();
//     System.out.println("Please enter Place");
//      String place=sc.next();
try
{
//String sql="insert into user(name,place) values('"+name+"','"+place+"')";
//String sql1="update user set name='swathy' where place='klm'";
String sql2="delete from user where name='lux' ";
System.out.println(sql2);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
Statement stmt=con.createStatement();
System.out.println(stmt.executeUpdate(sql2));
int i=stmt.executeUpdate(sql2);
if(i==1)
   {
	System.out.println("SUCCESSFULLY INSERTED");
   }
}
catch(Exception e)
{
	System.out.println(e);
}
finally
{
	
}

}
}
