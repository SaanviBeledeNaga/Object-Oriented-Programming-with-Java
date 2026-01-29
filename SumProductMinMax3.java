import java.util.Scanner;
public class SumProductMinMax3
{
	public static void main(String[] args)
	{
		int x, y, z, sum, product; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		x=sc.nextInt();
		System.out.print("Enter second integer: ");
		y=sc.nextInt();
		System.out.print("Enter third integer: ");
		z=sc.nextInt();
		sum=x+y+z;
		System.out.println("The sum is: "+sum);
		product=x*y*z;
		System.out.println("The product is: "+product);
		int min=x;
		if(y<min)
		{
			min=y;
		}
		if(z<min)
		{
			min=z;
		}
			System.out.println("The min integer is: "+min);
		int max=y;
		if(x>max)
		{
			max=x;
		}
		if(z>max)
		{
			max=z;
		}
			System.out.println("The max integer is: "+max);
	}
}
		
		
	