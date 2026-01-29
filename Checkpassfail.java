import java.util.Scanner;
public class Checkpassfail
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your marks");
		int m= sc.nextInt();
		System.out.println("the marks are " + m);
		if (m>=50)
		{
			System.out.println("PASS");
		}
		else 
		{
			System.out.println("FAIL");
		}
	}
}
			
