class NumberPalindrome
{
	public static void main(String[] args)
	{
	int input=1224,reverse=0;
	int number=input;
	while(number!=0)
	{
		int remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
	}
	System.out.println(reverse);
	if (input==reverse)
		System.out.println("number is Palindrome");
	}
}