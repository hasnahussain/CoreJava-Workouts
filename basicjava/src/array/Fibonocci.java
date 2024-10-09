package array;
import java.util.Scanner;

public class Fibonocci 
{
public static void main(String[] args)
{
	System.out.println("Enter the limit: ");
	Scanner Sc=new Scanner(System.in);
	int limit=Sc.nextInt();
	int ar[]=new int[limit];
	if(limit>0)
	{
		ar[0]=0;
	}
	if(limit>1)
	{
		ar[1]=1;
	}
		for(int i=2;i<limit;i++)
		{
			ar[i]=ar[i-2]+ar[i-1];
		}
	
	for(int i=0;i<limit;i++)
	{
		System.out.println("The fibonocci series"+ar[i]);
	}
}
}
