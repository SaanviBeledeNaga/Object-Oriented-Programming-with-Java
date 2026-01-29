import java.util.Scanner; //23-09-25
class Evenodd
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(n%2==0)
			{
			System.out.println("It is an even number");
			}
		else
			{
			System.out.println("It is an odd number");
			}
		System.out.println("Done");
	}
}
		
		