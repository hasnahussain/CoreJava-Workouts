package a;
import java.util.Scanner;

public class Polymorphism 
{
	  void Area(double r)
	{
	    //Area of circle
	    double area=3.14*r*r;
	    System.out.println("Circle area is"+" " +area);
	}
	 void Area(int l)
	 {
			//Area of square
			double squarearea=l*l;
			System.out.println("The area of sqaure is"+" "+squarearea);
	 }
	 void Area(int c,int d)
	 {
		
			int rectanglearea=c*d;
			System.out.println("The Area of rectangle is "+" "+rectanglearea);
	 }
	 void Area(double e,double f)
	 {
		 double  triarea=0.5*e*f;
		 System.out.println("The area of triangle is"+ " "+triarea);
	 }
	
public static void main(String[] args)
{
System.out.println("1.Area of Circle:\n2.Area of Sqaure:\n3:Area of Rectangle:\n4.Area of Triangle");
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
//object creation
Polymorphism obj=new Polymorphism();
switch (value)
{
case 1:
	System.out.println("Radius of circle");
	Scanner S=new Scanner(System.in);
	int radius=S.nextInt();
	obj.Area(radius);
	break;
case 2:
	System.out.println("Length of Square");
	Scanner A=new Scanner(System.in);
	int length=A.nextInt();
	obj.Area(length);
	break;
case 3:
	System.out.println("Length of a side");
	Scanner P=new Scanner(System.in);
	System.out.println("Breadth length");
	int len=P.nextInt();
	int bre=P.nextInt();
	obj.Area(len,bre);
	break;
case 4:
	Scanner J=new Scanner(System.in);
	System.out.println("Enter heigth");
	double he=J.nextInt();
	System.out.println("Enter length");
	double la=J.nextInt();
	obj.Area(he,la);
	break;
	
}
}
}
