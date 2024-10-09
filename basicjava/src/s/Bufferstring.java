package s;

public class Bufferstring {
public static void main(String[] args) {
	StringBuffer name=new StringBuffer("Hello");
	name.append(" World");
	System.out.println(name);
	name.reverse();
	System.out.println(name);
}
}
