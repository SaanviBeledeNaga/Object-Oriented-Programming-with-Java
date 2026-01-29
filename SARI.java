class SARI
{
	public static void main(String[] args)
	{
		int sum=0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int number = LOWERBOUND;
		/*for(int number=LOWERBOUND;number<=UPPERBOUND;number++)
		{
			sum=sum+number;
		}
		*/
		do
		{
			sum+=number;
			number++;
		}
		while(number<=UPPERBOUND);
		average=(float)sum/UPPERBOUND;
		System.out.println("sum of first 100 numbers "+sum);
		System.out.println("average of first 100 numbers "+average);
	}
		
}
		
