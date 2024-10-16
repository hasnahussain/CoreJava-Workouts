package Base;

public class Counter 
{
	static int count=0;
public static synchronized void count()//synchronized using for thread safe,static used to access by the two threads
{
	for(int i=0;i<10;i++)
	{
		System.out.println("count "+i+":"+count++);
	}
}
}
