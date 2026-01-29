public class HarmonicSum
{
	public static void main (String[] args)
	{
		double i;
		double suml2r=0.0;
		double sumr2l=0.0;
		double absDiff;
		for(i=1;i<=50000;i++)
		{
			suml2r += 1/i;
		}
		System.out.println("sum from left to right is " +suml2r);
		
		for(i=50000;i>=1;i--)
		{
			sumr2l += 1/i;
		}
		System.out.println("sum from right to left is " +sumr2l);
		if(suml2r>sumr2l)
		{
			absDiff = suml2r-sumr2l;
		}
		else
		{
			absDiff = sumr2l-suml2r;
		}
		System.out.println("absolute difference is " +absDiff);
	}
}

