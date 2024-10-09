package array;

public class Evensqaure
{
	 static void checkevenorodd(int x)
	{
		if(x%2==0)
		{
			System.out.println(x*x);
		}
		else
		{
			System.out.println(x*x*x);
		}
	}
	
	
public static void main(String[] args) 
{
	int [] ar= {2,3,4,5,6};
	for(int i=0;i<ar.length;i++)
	{
		checkevenorodd(ar[i]);
	}
}
}
