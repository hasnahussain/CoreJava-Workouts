package a;

import java.util.Scanner;

public class PMDtoB
{
public static void main(String[] args)
{

System.out.println("Check Palindrome");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check palindrome");
	int n=sc.nextInt();
	int rem=0,rev=0;
	int value=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
	}
	

	 if(rev==value)
{
	System.out.println(rev+" It is palindrome");
}
	else
	{
		System.out.println("Not palindromre");
	}
	}

	}



