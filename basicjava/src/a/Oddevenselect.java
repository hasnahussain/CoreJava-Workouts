package a;

import java.util.Scanner;

public class Oddevenselect 
{
	void oddeven(int x)
	{
	if 	(x%2==0)
	{
		System.out.println(x+"It is even");
	}
	else
	{
		System.out.println(x+"it is odd");
	}
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int a=sc.nextInt();
	Oddevenselect Obj=new Oddevenselect();
	int rem=0;
	while(a>0)
	{
		
		rem=a%10;
		Obj.oddeven(rem);
		a=a/10;
	}
}
}	
