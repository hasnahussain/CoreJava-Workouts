package a;
import java.util.Scanner;

public class stringcharacterfind
{
public static void main(String[] args)
{
	System.out.println("Enter a string");
	String str="Hasnagfhdsyrwyfreffsswefvbkjsssssssss";
	char a='s';
	int count=0;
	int len=str.length()-1;
	
	while(len>=0)
	{
		if(str.charAt(len)==a)
		{
			count++;
		}
		len--;
	}
	System.out.println(count);	
}
}
