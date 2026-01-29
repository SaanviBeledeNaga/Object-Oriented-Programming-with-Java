import java.util.Scanner;
public class TimeTable 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.print(" * |");
        for (int col = 1; col <= size; col++) 
		{
            System.out.printf("%4d", col);
        }
        System.out.println();
        System.out.print("----");
        for (int col = 1; col <= size; col++) 
		{
            System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= size; row++) 
		{
             System.out.printf("%2d |", row);
            for (int col = 1; col <= size; col++) 
			{
				System.out.printf("%4d", row * col);
            }
            System.out.println();
		}
	}
}