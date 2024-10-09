package a;

import java.util.Scanner;

public class Sumofdigit 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in)	;
System.out.println("Enter a number");
int n=sc.nextInt();
Sumofdigit Obj=new Sumofdigit();
int rem=0,rev=0;
int temp=0;
while(n>0)
{
	rem=n%10;
	temp=temp+rem;
	n=n/10;
}
System.out.println(temp);
}
}