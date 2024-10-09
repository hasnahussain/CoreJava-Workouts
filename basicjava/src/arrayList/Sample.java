package arrayList;

import java.util.Scanner;

public class Sample 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter size");
	int a=s.nextInt();
	char ch[]=new char[a];
	for(char c=0;c<a;c++)
	{
		ch[c]=s.next().charAt(0);
	}
	int j=0;
	char r[]=new char[a];
	for(int i=a-1;i>=0;i--)
	{
		r[j]=ch[i];
		j++;
	}
	for(char c:r)
	{
		System.out.println(c);
	}
}
}
