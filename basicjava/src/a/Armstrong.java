package a;
import java.util.Scanner;

public class Armstrong 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	int temp=n;
	int len=0,rem,mul=1,arm=0;
	while(temp>0)
	{
		len=len+1;
		temp=temp/10;
	}
	int temp1=n;
	while(temp1>0)
	{
		rem=temp1%10;
		for(int i=1;i<=len;i++)
		{
		mul=mul*rem;
		}
		arm=arm+mul;
		temp1=temp/10;
	}
	if(arm==temp)
	{
		System.out.println("The number is armstrong");
	}
	else
	{
		System.out.println("The number is not armstrong");
	}
}
}
