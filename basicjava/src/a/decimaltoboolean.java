package a;

import java.util.Scanner;

public class decimaltoboolean 
{
	
public static void main(String[] args) 
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int i=sc.nextInt();
while(i>0)
{
	if(i%2==0)
	{
		System.out.println(0);
	}
	else
	{
		System.out.println(1);
	}
	i=i/2;
}
}}
  
    
	
	


