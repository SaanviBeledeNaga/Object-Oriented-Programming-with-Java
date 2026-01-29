import java.util.Scanner;
public class Add2Integer
{
	public static void main(String[] args)
	{
		int number1,number2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		number2 = sc.nextInt();
		sum=number1+number2;
		System.out.print("The sum is: "+sum);
	}
}
		
	

