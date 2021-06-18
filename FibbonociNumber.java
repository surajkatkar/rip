class FibbonociNumber
{
	public static void main(String[] args)
	{
		int number1=0,number2=1,number3=0;
		System.out.print(number1+" "+number2);
		for(int count=0;count<10;count++)
		{
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
		}
	}
}