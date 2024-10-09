package array;

public class Stringtoarray
{
public static void main(String[] args) 
{
	String s="java";
    //convert string to an array
    char[] charArray=s.toCharArray();
    //print the array elements
    for(char c :charArray)
    {
    	System.out.println(c);
    }
}
}
