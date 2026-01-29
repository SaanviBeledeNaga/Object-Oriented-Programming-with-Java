public class MinimumAndMaximum
{
	public static void main(String[] args)
	//28-08-2025
	//finding the minimum and maximum out of any three numbers
	{
		int A=5;
		int B=8;
		int C=11;
		if(A<B && A<C)
		{
			System.out.println("A is minimum");
		}
		if(B<A && B<C)
		{
			System.out.println("B is minimum");
		}
		if(C<A && C<B)
		{
			System.out.println("C is minimum");
		}
		if(A>B && A>C)
		{
			System.out.println("A is maximum");
		}
		if(B>A && B>C)
		{
			System.out.println("B is maximum");
		}
		if(C>A && C>B)
		{
			System.out.println("C is maximum");
		}
		
	}
}
