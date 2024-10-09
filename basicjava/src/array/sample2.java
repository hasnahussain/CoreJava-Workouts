package array;

import java.util.Scanner;

public class sample2
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements to array");
	int n=sc.nextInt();
	int [] ar=new int[n];
	System.out.println("Enter elements of array");
	
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();			
		}
	findDuplicate(ar);
}
static void findDuplicate(int [] ar)
{
	int count=0;
	boolean hasDuplicate=false;
	System.out.println("duplicate found");
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
		if(ar[i]==ar[j])
		{
			
			hasDuplicate=true;
			count++;
			System.out.println(ar[i]+count);
			break;
		}
		}
	}
	if(!hasDuplicate)
	{
		System.out.println("no duplicate");
	}
}
}
