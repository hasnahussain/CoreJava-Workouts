package a;
import java.util.Scanner;

public class Count 
{
public static void main(String[] args) 
{
	System.out.println("enter a limit number");//how many 2 present within a limit
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	int count=0;
	for(int i=0;i<=limit;i++)
	{
		int number=i;
		while(number>0)
		{
			int digit =number%10;
			if(digit==2)
			{
				count++;
			}
			number=number/10;
		}
	}
	System.out.println(count+"there are "+" 2's present");

}
}
