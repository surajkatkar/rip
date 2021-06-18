class ReverseString
{
	public static void main(String[] args)
	{
		String name="BooB",rev;
		rev=reverse(name);
		System.out.println(rev);
		if(name.equals(rev))
			System.out.println("palindrome");
	}
	
	public static String reverse(String input)
	{
		int len=input.length();
		String output="";
		//System.out.println(len);
		for(int num=len-1;num>=0;num--)
		{
			output+=input.charAt(num);
		}
		return output;
	}
}