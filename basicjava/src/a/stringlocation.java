package a;
import java.util.Scanner;

public class stringlocation 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println("Search character");
	//character initialization syndax
	char c=sc.next().charAt(0);
	int len=str.length(),i=0,count=0;
	while(i<len)
	{
		if(str.charAt(i)==c)
		{
		count++;
		System.out.println("location "+(i+1));
		}
		i++;
	}
	System.out.println(count);
	
}
}
