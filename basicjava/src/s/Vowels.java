package s;

import java.util.Scanner;

public class Vowels
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter astring");
	String name=sc.nextLine();
	int len=name.length()-1;
	int count=0;
	while(len>=0)
	{
	if((name.charAt(len)=='A')||(name.charAt(len)=='a')||(name.charAt(len)=='E')||(name.charAt(len)=='e')||(name.charAt(len)=='I')||(name.charAt(len)=='i')||(name.charAt(len)=='O')||(name.charAt(len)=='o')||(name.charAt(len)=='U')||(name.charAt(len)=='u'))	
	{
	count++;	
	}
	len--;
	}
	System.out.println("the number of vowels" +count);
}
}
