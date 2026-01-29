public class Codechef1
{
	public static void main(String[] args)
	{
		//29-08-25
		//using while, print the square of first five natural numbers.
		int i=1;
		while (i<=5)
		{ 
			System.out.println(i*i);
			i=i+1;
		}
		//using do-while, print the factorial of 5.
		int product=1;
		int n=5;
		do
		{ 
			product=product*n;
			n = n-1;
		}while(n>0);
		System.out.println(product);
	}
}