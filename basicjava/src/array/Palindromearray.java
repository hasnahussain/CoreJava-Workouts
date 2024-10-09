package array;

public class Palindromearray 
{
	 static void checkPalindrome(int x)
	{
		int temp=x;
		int rev=0,rem=0;
		while(x>0) 
		{	
		rem =x%10;
		rev=rem+rev*10;
		x=x/10;
		if(temp==rev)
		{
			System.out.println(temp+"Palindrome");
			
		}
		}
	}
	
public static void main(String[] args)
{
	
	int [] ar= {101,202,12,18,30};
	

	for(int i=0;i<ar.length;i++)
	{
          
			checkPalindrome(ar[i]);
			
			
	}
}
}
