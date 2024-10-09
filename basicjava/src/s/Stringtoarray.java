package s;

public class Stringtoarray 
{
public static void main(String[] args)
{
	// Create a string
	String myStr = "Hello";

	// Convert the string to a char array
	char[] myArray = myStr.toCharArray();

	// Print array elements
	for (char i : myArray) {
	  System.out.println(i);
	}	
}
}
