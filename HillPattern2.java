import java.util.Scanner;
public class HillPattern2
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int row = size; row >= 1; row--) 
		{
            for (int col = 1; col <= 2 * size - 1; col++) 
			{
                if ((row + col >= size + 1) && (row >= col - size + 1))
				{
                    System.out.print("#");
				}
                else
				{
                    System.out.print(" ");
				}
            }
            System.out.println();
        }
    }
}