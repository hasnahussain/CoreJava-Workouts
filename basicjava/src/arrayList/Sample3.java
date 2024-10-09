package arrayList;

import java.util.Scanner;

public class Sample3 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String str=sc.next();
	int len=str.length(),count=0;
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)=='!'||str.charAt(i)=='#'||str.charAt(i)=='*'||str.charAt(i)=='%')
		{
		count++;	
		}
		
	}
	System.out.println(count+"character present");
}
}
