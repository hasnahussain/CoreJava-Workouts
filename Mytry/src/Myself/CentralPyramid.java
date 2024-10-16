package Myself;

public class CentralPyramid 
{
public static void main(String[] args)
{
	int row=6;
	for( int i=0;i<row; i++)
	
		//This is the outer loop that controls the number of rows.
		//The loop starts with i = 0 and runs until i is less than row (6 in this case).
		//With each iteration, i is incremented by 1, meaning this loop will run 6 times, once for each row of the pyramid.		
	{
		for( int j=row-i;j>1; j--)
			//This inner loop is responsible for printing the spaces before the stars in each row.
			//It starts with j = row - i and runs until j > 1, decrementing j with each iteration.
			//The number of spaces decreases as i increases, which creates the pyramid shape by shifting the stars to the right on each subsequent row.
			//System.out.print(" ");: Prints a space. The cursor does not move to the next line, so spaces are printed on the same line.
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

