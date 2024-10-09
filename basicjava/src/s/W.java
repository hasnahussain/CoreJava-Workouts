package s;

import java.util.Scanner;

public class W 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String name=sc.nextLine();
	int len=name.length()-1;
	int count=0;
	while(len>=0)
	{
		if(name.charAt(len)=='W'||(name.charAt(len)=='w'))
		{
			count++;	
		}
		
		len--;
	}
	System.out.println("found");
	
System.out.println(count);
}
}
