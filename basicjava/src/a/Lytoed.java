package a;
import java.util.Scanner;

public class Lytoed 
{
public static void main(String[] args) 
{
	System.out.println("Enter a word");
	Scanner scan=new Scanner(System.in);
	String word=scan.nextLine();
	int length = word.length();
    if (length >= 2 && word.charAt(length - 2) == 'l' && word.charAt(length - 1) == 'y') 
    {
    
        String modifiedWord = word.substring(0, length - 2) + "ed";
        System.out.println("Modified word: " + modifiedWord);
    }
    else 
    {
        System.out.println("The word does not end with 'ly'.");
    }
}
}
