import java.util.Scanner;
public class  Multiplicationtable
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number= sc.nextInt();
		int i=1;
		for(i=1;i<=10;i++)
		{
		System.out.print(number*i+" ");
		}
	}
}

