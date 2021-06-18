public class Overloading
{	
	public static void add(String str)
	{
		System.out.println("String type");
	}
	public static void add(Object obj)
	{
		System.out.println("Object type");
	}
	public static void main (String []args)
	{
		add("Suraj");
		add(new Object());
		add(null);
	}
}