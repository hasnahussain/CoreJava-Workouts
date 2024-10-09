package array;
import java.util.Scanner;

public class Largeorsmall
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements in array:");
	int n=sc.nextInt();
	System.out.println("Enter elements in array:");
	int [] ar=new int[n];
	int temp=0;
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	for(int j=i+1; j<ar.length;j++)
	{
		if(ar[i]<ar[j])
		{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
	}
	}
	int sum=ar[0]+ar[ar.length-1];
	System.out.println("the sum is"+sum);
	
}
}
