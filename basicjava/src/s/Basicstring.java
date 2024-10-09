package s;

import java.util.Scanner;

public class Basicstring 
{
public static void main(String[] args)
{
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	System.out.println(name);
	System.out.println(name.length());
System.out.println(name.charAt(4));
}
}
