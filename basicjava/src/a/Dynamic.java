package a;

import java.util.Scanner;

public class Dynamic 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("1: Find largest of 3 numbers.");
	System.out.println("2: Check the given number odd/even");
	System.out.println("3: Multiplication table");
	System.out.println("Please enter anyone from the above list");
	int value=sc.nextInt();
	Dynamic obj = new Dynamic();
	switch (value)
	{
	case 1:
		obj.largestNumber();
		break;
	case 2:
		obj.oddEven();
		break;	
	case 3:
		obj.multiplicatonTable();
		break;	
	default :
	System.out.println("Invalid Operation");
	break;
	}
}
	
void largestNumber()
	{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 1st no:");
	System.out.println("Enter 2nd no:");
	System.out.println("Enter 3rs no:");
	
	int a=S.nextInt();
	int b=S.nextInt();
	int c=S.nextInt();
	if((a>=b)&&(a>=c))
	{
		System.out.println(a+" is Largest");
	}
	else if(b>=c)
	{
	System.out.println(b+" is largest");	
	}
	
}
void oddEven() 
{
	Scanner S=new Scanner(System.in);	
	System.out.println("Enter a number");
	int d=S.nextInt();
	if(d%2==0)
	{
		System.out.println(d+ "Even number");
	}
	else
	{
		System.out.println(d+"Odd number");
	}
}
void multiplicatonTable()
{
	Scanner S =new Scanner(System.in);
	System.out.println("Enter a number");
	int e=S.nextInt();
	int f=1;
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	System.out.println(f+ "*" +e+ "=" +(f++*e));
	

}
}
