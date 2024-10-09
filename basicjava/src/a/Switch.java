package a;

import java.util.Scanner;

public class Switch 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("1: Addition");
	System.out.println("2: Substraction");
	System.out.println("3: Multiplication");
	System.out.println("4: Division");
	System.out.println("Please enter the option:");
	int a=sc.nextInt();
	Switch obj=new Switch();
	switch(a)
	{
	case 1:
		obj.addNumber();
		break;
	case 2:
		obj.subNumber();
		break;
	case 3:
		obj.mulNumber();
		break;
	case 4:
		obj.divNumber();
		break;
		default :
			System.out.println("Invalid operation");
			break;
		}
	
}
void addNumber()
{
	System.out.println("Enter the 1st number:");
    Scanner obj1=new Scanner(System.in)	;
    int b=obj1.nextInt();
    System.out.println("Enter the 2nd number:");
    int c=obj1.nextInt();
    System.out.println("The Addition output is"+(b+c));
}
void subNumber()
{
	System.out.println("Enter the 1st number:");
    Scanner obj1=new Scanner(System.in)	;
    int d=obj1.nextInt();
    System.out.println("Enter the 2nd number:");
    int e=obj1.nextInt();
    System.out.println("The Subtraction output is"+(d-e));	
}
void mulNumber()
{
	System.out.println("Enter the 1st number:");
    Scanner obj1=new Scanner(System.in)	;
    int f=obj1.nextInt();
    System.out.println("Enter the 2nd number:");
    int g=obj1.nextInt();
    System.out.println("The  Multiplication output is"+(f*g));	
}
void divNumber()
{
	System.out.println("Enter the 1st number:");
    Scanner obj1=new Scanner(System.in)	;
    int h=obj1.nextInt();
    System.out.println("Enter the 2nd number:");
    int i=obj1.nextInt();
    if(i==0)
    {
    	System.out.println("the operation can't done.inavlid");
    }
    else 
    {
    	 System.out.println("The  Multiplication output is"+(h/i));		
    }
   		
}
}
