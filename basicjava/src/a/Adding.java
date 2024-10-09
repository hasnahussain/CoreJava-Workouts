package a;

import java.util.Scanner;

public class Adding
{
	public static void main(String[] args) 
	{
		Adding obj=new Adding();
		obj.sumNubmers();
	}
void sumNubmers()
{
	System.out.println("Enter number 1");
	Scanner obj1 =new Scanner(System.in);
	int a=obj1.nextInt();
	System.out.println("Enter number 2");
	Scanner obj2 =new Scanner(System.in);
	int b=obj2.nextInt();
	System.out.println("The output is :"+(a+b));
	
}
}

