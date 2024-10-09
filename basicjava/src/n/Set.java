package n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set
{
public static void main(String[] args) 
{
	HashSet<String> swathy = new HashSet<String>();
	swathy.add("hello");
	swathy.add("hello");// duplicate allowed alla
	swathy.add("happy");
	System.out.println(swathy);
	
	//using linkedHashSet
	
	LinkedHashSet<String> lekshmi=new LinkedHashSet<String>();
	lekshmi.add("gejger");
	lekshmi.add("gejger");
	System.out.println(lekshmi);
	
	//using iterator
	
	// Get the iterator
    Iterator<String> itr = swathy.iterator();
    while(itr.hasNext()) {
    	  System.out.println(itr.next());
    	}
    //arrayList
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  
//Tree set

TreeSet<String> set = new TreeSet();
set.add("Hasna");
set.add("lekshmi");
set.add("swathy");
set.add("jubia");
System.out.println(set);//ascending orderil varum
}
}

