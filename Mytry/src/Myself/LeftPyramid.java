package Myself;

import java.util.Scanner;

public class LeftPyramid 
{
	
	public static void main(String args[])   
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		for( int i=0;i<rows; i++)
		{
			for( int j=2*(rows-i);j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}