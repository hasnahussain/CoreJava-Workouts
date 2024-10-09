package array;

public class Prime 
{
public static void main(String[] args) 
{
	int [] ar= {2,3,5,6,7};
	Prime n=new Prime();
		for(int i=0;i<ar.length;i++)
		{
			int r=n.checkPrime(ar[i]);
			if(r==0)
			{
				System.out.println(ar[i]+"is prime");
			}
			else
			{
				System.out.println(ar[i]+"not prime");
			}
		}
		
	}
	int checkPrime(int x)
	{
		int flag=0;
		
			for(int i=2;i<=x/2;i++)
			{
				if(x%2==0)
				{
					
					flag=1;
					
				}
			}
			return flag;
				
			}
		
		
		
	}


