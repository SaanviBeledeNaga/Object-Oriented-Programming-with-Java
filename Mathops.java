public class Mathops
{
	int sum(int a, int b)
	{
		return a+b;
	}
	double sum( double a, double b)
	{
		return a+b;
	}
	int sum(int a, int b, int c)
	{ 
		return a+b+c;
	}
	public static void main(String[] args)
	{
		Mathops mo = new Mathops();
		System.out.println(mo.sum(5.6,7.8));
		System.out.println(mo.sum(5,7,10));
		System.out.println(mo.sum(5,7));
	}
}