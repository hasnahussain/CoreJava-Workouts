package arrayList;

import java.util.Scanner;

public class Reverseword 
{
	
	
	public static void main(String[] args) 
	{		
       Scanner  sc=new Scanner(System.in);
       System.out.println("Enter a sentence");
       String  S=sc.nextLine();
       char [] charArray=S.toCharArray();
       int len=charArray.length;
       for(int i=len-1;i>=0;i--)
       {
       	System.out.print(charArray[i]);
       }
	}
}
