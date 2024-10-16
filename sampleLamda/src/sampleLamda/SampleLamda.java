package sampleLamda;
interface display
{
	String show(String name);
}
public class SampleLamda 
{
	public static void main(String[] args) 
	{
		//display d=new display() 
		//{
			
			//@Override
			//public String show(String name) 
			//{
				
			//	return " Hello "+ name;
				
			//}
		//};
		
		//instead of this method
		
		
		display d=(name)->
		{
			
		return "welcome mr"+name;
		};	
	
	System.out.println(d.show("Lux"));//value kodukumbo "" kodukuka
}
}