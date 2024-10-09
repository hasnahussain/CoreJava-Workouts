
package variable;

public class Circle 
{
int radius;

public Circle(int radius) 
{
	super();
	this.radius = radius;
}
public Circle(Circle duplicateCircle)
{
	radius=duplicateCircle.radius;
	
}
public static void main(String[] args) 
{
	Circle c=new Circle(5);
	Circle c1=new Circle(c);
	System.out.println(c1.radius);
}
}
