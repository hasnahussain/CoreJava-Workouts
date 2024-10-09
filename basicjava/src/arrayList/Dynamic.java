package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic 
{
	private static ArrayList<Object> list=new ArrayList<>();
	static void addN()
	{
		  
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	list.add(str);	
	int num = sc.nextInt();
    list.add(num);
	System.out.println(list);
	}
	
	
	static void viewN()
	{
		System.out.println("List contents:");
        for (Object item : list)
        {
            System.out.println(item);
        }
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any one of the options\n1:ADD\n2:VIEW\n3:DELETE\n4:SIZE\n5:SEARCH\n6:EXIT\nPlease enter");
    int value=sc.nextInt();
switch (value)
{
case 1:
	addN();
	break;
case 2:
	viewN();
	break;
}

}
}
