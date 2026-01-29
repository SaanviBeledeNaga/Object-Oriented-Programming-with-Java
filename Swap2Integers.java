import java.util.Scanner;
public class Swap2Integers
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x = sc.nextInt();
		System.out.print("Enter the second number: ");
		int y = sc.nextInt();
		int temp;
		temp =x;
		x = y;
		y = temp;
		System.out.println("now first number is "+x);
		System.out.println("now second number is "+y);
	}
}
		