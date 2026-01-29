import java.util.Scanner;
public class HillPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");        
		int size = sc.nextInt();
        for (int row = 1; row <= size; row++) 
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
        for (int row = size - 1; row >= 1; row--) 
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