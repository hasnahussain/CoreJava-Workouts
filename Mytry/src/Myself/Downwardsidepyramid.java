package Myself;

public class Downwardsidepyramid 
{
	public static void main(String[] args)  
	{  
	int rows=7;      
	//inner loop  
	for (int i= rows-1; i>=0 ; i--)  
		//This is the outer loop that controls the number of rows to be printed.
		//It starts with i = rows - 1, which is 6 in this case (since rows is 7), and it decrements i by 1 on each iteration.
		//The loop continues until i reaches 0.
		//This loop effectively decreases the number of stars printed in each row, creating the downward triangle shape.
	{  
	//outer loop  
	for (int j=0; j<=i; j++)  
	{  
	//prints star and space  
	System.out.print("*" + " ");  
	}  
	//throws the cursor in the next line after printing each line  
	System.out.println();  
	}  
	}  
}
