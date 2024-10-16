package s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Switch 
{
	public static Scanner s=new Scanner(System.in);
	static void add()
	{
		
		System.out.println("Enter id");
		int id=s.nextInt();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter salary");
		String salary=s.next();
		
		try
		{
			String sql="insert into employees (id,name,salary)values("+id+",'"+name+"','"+salary+"')";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("\n");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
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
	static void update()
	{
		System.out.println("Enter id ");
		int id=s.nextInt();
		System.out.println("enter new name to update");
		String newName=s.next();
		System.out.println("enter new salary to update");
		String newSalary=s.next();
		try
		{
			String sql="update  employees set name ='"+newName+"',salary ='"+newSalary+"' where id="+id;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("\n");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
		if(i==1)
		   {
			System.out.println("SUCCESSFULLY UPDATED");
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
	static void delete()
	{
		
		System.out.println("Enter id for delete ");
		int id=s.nextInt();
		try
		{
			String sql="delete from employees where id= "+id;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("\n");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
		if(i==1)
		   {
			System.out.println("SUCCESSFULLY DELETED");
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
	static void deleteall()
	{
		
		try
		{
			String sql="delete from employees";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
			
			System.out.println("\n");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
		if(i==1)
		   {
			System.out.println("SUCCESSFULLY DELETED All");
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
	static void view()
	{

		try
		{
			String sql="select * from employees";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1","root","Hasna@2002"); 
			
			System.out.println("\n");
			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String salary=rs.getString("salary");
			System.out.println("id: "+id+",name:"+name+",salary: "+salary);
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
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	
		
		System.out.println("1.ADD");
		System.out.println("2.UPDATE");
		System.out.println("3.DELETE");
		System.out.println("4.DELETE ALL");
		System.out.println("5.VIEW");
		System.out.println("6.EXIT");
		System.out.println("PLEASE ENTER A OPTION");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		add();
			break;
		
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			deleteall();
			break;
		case 5:
			view();
			break;
		default :
			System.out.println("exited");
			break;
		}
}
}
