public class Computepi
{
	public static void main(String[] args)
	{
		double i;
		int X = 1000;
		double sum=0.0;
		for (i = 1;i <=X; i+= 2)
		{
			if(i % 4 == 1) 
			{
			 sum += 1/i;
			}
			else if(i % 4 == 3)
			{
			 sum -= 1/i;
			}
			else
			{
				System.out.println("impossible");
			}
		}
		double pi = 4*(sum);
		System.out.println(pi);
	}
}