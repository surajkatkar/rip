class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int input=153;
		int number=input,sum=0;
		while(number!=0)
		{
			int digit=number%10;
			System.out.println(digit);
			sum+=(digit*digit*digit);
			number=number/10;
		}
		System.out.println(sum);2
		if (sum==input)
			System.out.println("Armstrong Number");
	}
}