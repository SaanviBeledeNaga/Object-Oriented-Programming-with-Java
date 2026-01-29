import java.util.Scanner;
public class Starpattern
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		{
			for(int r=1;r<=n;r++)
				{
					for(int c=1;c<=n;c++)
					{
						if(r==1||r==n||c==1||c==n)
						{
							System.out.print("#"+" ");
						}
						else
						{
							System.out.print("  ");
						}
					}
				System.out.println();
				}
		}
	}
}
