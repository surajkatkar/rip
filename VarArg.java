public class VarArg
{	
	static void addition(int... x)
	{
		int total=0;
		for(int num : x)
		{
			total=total+num;
		}
		System.out.println("total=" +total);
	}
	public static void main(String args[])
	{
		System.out.println("Hello ");
		addition(10,20);
		addition();
	}
}