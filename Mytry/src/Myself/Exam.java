package Myself;

public class Exam 
{
public static void main(String[] args) 
{
	int row=6;
	for( int i=0;i<row; i++)
	{
		for( int j=row-i;j>1; j--)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<=i; j++)
		{
			System.out.print("* ");
		}
		for(int j=2;j<2*i-1;j++)
		{
			System.out.println(" ");
		}
		
		System.out.println();
	}

	

}
}
