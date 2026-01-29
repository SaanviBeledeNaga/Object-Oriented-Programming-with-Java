import java.util.Scanner;
public class  Booleanflag
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int i= sc.nextInt();
		boolean invalid=false;
		boolean valid=true;
		while(valid)
		{
		if(i>=0 && i<=10 || i>=90 && i<=100)
			{
				System.out.println("The number entered is: "+i);
			}
		}
		while(invalid)
		else
			{
				System.out.println("Try again, invalid input");
			}
		}	
	}
}