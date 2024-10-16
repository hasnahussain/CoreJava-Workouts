package Base;

public class mainprgm {
	
public static void main(String[] args) throws Exception
{
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			Counter.count();
			
		}
	});
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			Counter.count();
		}
		});
	t1.start();
	t2.start();
	t1.join();//t1.join() and t2.join(): These lines make the main thread wait until both t1 and t2 have completed their execution, ensuring that the main program does not terminate before the threads are done.
	t2.join();
}
	//instead of this way,another way is by extending to thread class
	
}
