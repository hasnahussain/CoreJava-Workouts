package arrayList;

public class Nap 
{
	private String name;
	@Override
	public String toString() {
		return "Nap [name=" + name + ", age=" + age + "]";
	}
	public Nap(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private int age;
}