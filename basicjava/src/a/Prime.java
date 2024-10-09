package a;

public class Prime 
{
static void checkPrime(int x)
{
     int m=0,flag=0;
     m=x/2;
     if(x==0||x==1)//prime number does not start with 2
     {
    	 System.out.println(x+" Not Prime");
     }
     else
     {
               for(int i=2;i<=m;i++)//compare the divided values
               {
	             if(x%i==0)
	             {
		System.out.println(x+" not prime");
		flag=1;
		break;
	             }       }
if(flag==0)
{
	System.out.println(x+" Is prime");
}
               }
}   
	public static void main(String[] args) 
	{
		checkPrime(1);
		checkPrime(2);
		checkPrime(7);
		
	}
}
