import java.util.Scanner;
public class InputValidation 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isValid = false;
        do 
		{
            System.out.print("Enter a number between 0  to 10 or 90 to 100: ");
            number = sc.nextInt();
            if ((number >= 0 && number <= 10) || (number >= 90 && number <= 100)) 
			{
                isValid = true;
            } 
			else 
			{
                System.out.println("Invalid input, try again");
            }
        } 
		while (!isValid);
        System.out.println("You have entered: " + number);
        sc.close();
    }
}
				