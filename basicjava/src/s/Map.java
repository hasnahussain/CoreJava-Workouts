package s;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;


public class Map
{
public static void main(String[] args) 
{
	 // Create a HashMap
	HashMap<String, Integer> hasMap=new HashMap<>();
	 // Add elements to the HashMap
	hasMap.put("swathy", 1);
	hasMap.put("lux", 2);
	hasMap.put("jubia", 3);
	  // Access elements in the HashMap
	System.out.println(hasMap.get("swathy"));
	 // Remove an element from the HashMap
	hasMap.remove("lux");
	// Check if an element is present in the HashMap
	System.out.println(hasMap.containsKey("swathy"));
	 // Get the size of the HashMap
	System.out.println(hasMap.size());
	//LinkedHashMap
	HashMap<String, Integer>lk=new HashMap();
	 // Add elements to theLinked HashMap
	lk.put("binila", 23);
	lk.put("midhun", 24);
	lk.put("jooby",54);
	Set s=lk.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	{  
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		hm.put(110,"Ravi");  
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");  
		hm.put(150, "Pawan");  
		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  
		}  
	//Linked
}
}
