package a;

import java.util.Scanner;

public class Factorial 
{
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("1:Factorial of number\n2:Multiplication table\nEnter any option");
	int value=sc.nextInt();
	Factorial obj=new Factorial();
	switch(value)
	{
	case 1:
		obj.fact();
		break;
	case 2:
		obj.multiplicationtable();
		break;
	}
}
void fact()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int fact=sc.nextInt();
	int a=1;
	while(a<=fact)
	{
	a=fact*a;
//	System.out.println(fact);
	a++;
}
	System.out.println(a);
}
void multiplicationtable()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int b=sc.nextInt();
	int c=1;
	while(c<=12)
	{
		
		System.out.println(c+" * "+b+" = "+(c*b));
		c++;
	}
	
}
}