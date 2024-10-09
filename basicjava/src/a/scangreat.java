package a;

import java.util.Scanner;

public class scangreat 
{
public static void main(String[] args) 
{
	scangreat obj = new scangreat();
	obj.numGreat();
}
void numGreat()
{
	System.out.println("Enter number 1:");
	Scanner obj1=new Scanner(System.in);
	int a=obj1.nextInt();
	System.out.println("Enter number 2:");
	Scanner obj2=new Scanner(System.in);
	int b=obj2.nextInt();
	if(a>b)
	{
		System.out.println(a+"is greater than" +b);
	}
	else
	{
		System.out.println(a+ "is less than" +b);
	}
}
}
