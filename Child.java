class Parent
{
	Object method()
	{
		System.out.println("Parent Constructor");
		return null;
	}
}
public class Child extends Parent
{
	public String method()
	{
		System.out.println("Child Constructor");
		return null;
	}
	public static void main (String[] args)
	{
		Parent p=new Parent();
		p.method();
		Child c=new Child();
		c.method();
		Parent p1=new Child();
		p1.method();
	}
}