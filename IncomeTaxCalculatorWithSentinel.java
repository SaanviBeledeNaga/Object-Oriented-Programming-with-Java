import java.util.Scanner;
public class IncomeTaxCalculatorWithSentinel
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your salary (or enter -1 to exit)");
		int s= sc.nextInt();
		double tax;
		final int SENTINEL = -1; //tra=tax rate above
		final double tra20k=0.1;
		final double tra40k=0.2;
		final double tra60k=0.3;
		while(s!=SENTINEL)
		{
			if(s<20000)
			{
				tax=0;
				System.out.println("Income tax applicable is "+tax);
			}
			else if(s<=40000)
			{
				tax=(s-20000)*tra20k;
				System.out.println("Income tax applicable is "+tax);
			}
			else if(s<=60000)
			{
				tax=20000*tra20k+(s-40000)*tra40k;
				System.out.println("Income tax applicable is "+tax);
			}
			else if(s>60000)
			{
				tax=20000*tra20k+20000*tra40k+(s-60000)*tra60k;
				System.out.println("Income tax applicable is "+tax);
			}
				System.out.println("enter your salary (or enter -1 to exit)");
				s= sc.nextInt();
		}
		System.out.println("bye!");
	}
}
			