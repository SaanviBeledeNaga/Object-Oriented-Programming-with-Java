import java.util.Scanner;
public class  IncomeTax
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your salary");
		int s= sc.nextInt();
		double tax;
		//tra=tax rate above
		final double tra20k=0.1;
		final double tra40k=0.2;
		final double tra60k=0.3;
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
	}
}
			