package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class list
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,4,6,7);
		
		list.stream().sorted().forEach(n->System.out.println(n));	
		//finding even number
		List<Integer>l=Arrays.asList(4,3,4,5,6,7);
		l.stream().filter(n->n%2==0)
		.map(n->n*2).sorted().forEach(n->System.out.println(n));	

	}

}
