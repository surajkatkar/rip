class FactorsOfNumber
{
	public static void main(String[] args)
	{
		for(int number=2;number<30;number++)
		{
			int primeCounter=0;
			for(int count=1;count<number;count++)
			{
			
				if(number%count==0)
				{
					primeCounter++;
					//System.out.print(count+" ");
				}
			}
			if(primeCounter==1)
				System.out.println(number+" Prime Number");
			else
				System.out.println(number);
		}
	}
	
}