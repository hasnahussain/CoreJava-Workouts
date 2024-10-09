package a;
import java.util.Scanner;

public class Equals
{
public static void main(String[] args)
{
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("Enter another String");
    String str1=sc.nextLine();

    if(str.equals(str1))
    {
    	System.out.println("The strings are equal");
    }
    else
    {
    	System.out.println("The strings are not equal1");
    }
}
}
