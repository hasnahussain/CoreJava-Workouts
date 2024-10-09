package a;
import java.util.Scanner;

public class vowelsorconsonuns
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	int len =str.length()-1;
	int count=0;
	int c=0;
	int k=0;
	while(len>=0)
	{
		if((str.charAt(len)=='A')||(str.charAt(len)=='a')||(str.charAt(len)=='E')||(str.charAt(len)=='e')||(str.charAt(len)=='I')||(str.charAt(len)=='i')||(str.charAt(len)=='O')||(str.charAt(len)=='o')||(str.charAt(len)=='U')||(str.charAt(len)=='u'))	
		{
		count++;
	
		}
		
		else
		{
			k++;
		}
		
		len--;
		
	}
	System.out.println(count+ "number of vowels");
	System.out.println(k+ "The consonunts");
}
}

