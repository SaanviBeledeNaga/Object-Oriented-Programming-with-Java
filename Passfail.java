import java.util.Scanner; //23-09-25
class Passfail
{
	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks");
		int m= sc.nextInt();
		System.out.println("Your marks are " + m);
		if(m>=49)
			{
				System.out.println("You have Passed");
			}
		else
			{
				System.out.println("You have Failed");
			}
		System.out.println("Done");
	}
}
			
		