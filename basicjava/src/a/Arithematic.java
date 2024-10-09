package a;

import java.util.Scanner;

public class Arithematic 
{
public static void main(String[] args) 
{
	Arithematic obj=new Arithematic ();
	obj.addNumber();
	obj.subNumber();
	obj.mulNumber();
	obj.divNumber();
	
}
void addNumber()
{
	System.out.println("Enter first number:\nEnter second number:");
	Scanner obj1 = new Scanner(System.in);
		int a=obj1.nextInt();
		Scanner obj2=new Scanner(System.in);
		int b= obj2.nextInt();
		System.out.println("The sum of numbers " +(a+b));
			
	
}
void subNumber()
{
	System.out.println("Enter first number:");
	Scanner obj3=new Scanner(System.in);
	int c=obj3.nextInt();
	System.out.println("Enter second number:");
	Scanner obj4=new Scanner(System.in);
	int d=obj4.nextInt();
	System.out.println("The subraction result is "+(c-d));	
}
void mulNumber()
{
	System.out.println("Enter first number:");
	Scanner obj5=new Scanner(System.in);
	int e=obj5.nextInt();
	System.out.println("Enter second number:");
	Scanner obj6=new Scanner(System.in);
	int f=obj6.nextInt();
	System.out.println("The multiplication result of numbers is :"+(e*f));
}
void divNumber()
{
	System.out.println("Enter first number:");
	Scanner obj7=new Scanner(System.in);
	int g=obj7.nextInt();
	System.out.println("Enter second number:");
	Scanner obj8=new Scanner(System.in);
	float h=obj8.nextFloat();
	System.out.println("The division result of numbers is "+(g/h));
}



}
