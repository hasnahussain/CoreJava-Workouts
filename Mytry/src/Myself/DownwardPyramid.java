package Myself;

public class DownwardPyramid 
{
	public static void main(String[] args)  
	{  
	int rows=8;  
	for (int i= 0; i<= rows-1; i++)  
	{  
	for (int j=0; j<=i; j++) 
		//This is the first inner loop that controls the number of spaces to be printed before the stars on each line.
		//It starts with j = 0 and increments j until it reaches the value of i.
		//As i increases, the number of spaces printed increases, which shifts the stars to the right, creating the right alignment of the triangle.
		//System.out.print(" ");: Prints a space without moving the cursor to the next line.
	{  
	System.out.print(" ");  
	}  
	for (int k=0; k<=rows-1-i; k++)  
		//This is the second inner loop that controls the number of stars to be printed in each row.
		//It starts with k = 0 and runs until k reaches rows - 1 - i.
		//As i increases, the number of stars printed decreases because rows - 1 - i gets smaller with each iteration.
		//System.out.print("*" + " ");: Prints a star followed by a space on the same line.
	{  
	System.out.print("*" + " ");  
	}  
	System.out.println();  
	}  
	}  
}
