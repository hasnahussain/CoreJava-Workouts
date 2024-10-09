package variable;

import java.util.ArrayList;
import java.util.List;

public class example 
{
public static void main(String[] args)
{
	List<String> list = new ArrayList();  /*
	Generics-type casting
*/ 
	list.add("3");
	String s=list.get(0);
	System.out.println(s);
}
}
