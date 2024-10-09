package a;
import java.util.Scanner;

public class Palindromee 
{
public static void main(String[] args)
{
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String rev="";
	String str=sc.nextLine();
	int len=str.length()-1;
	while(len>=0)
	{
		rev=rev+str.charAt(len);
		len--;
	}
	if(str.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
}
}
