import java.util.Scanner;
public class AverageWithInputValidation 
{
    public static void main(String[] args) 
	{
        final int numstudents = 3;
        int mark;
        boolean isValid;
        int sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);
        for (int studentNo = 1; studentNo <= numstudents; studentNo++) 
		{
            isValid = false;
            do 
			{
                System.out.print("Enter the marks (0 to 100) of student " + studentNo);
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) 
				{
                    isValid = true;
                } 
				else 
				{
                    System.out.println("Invalid input, try again...");
                }
            } 
			while (!isValid);
            sum += mark;  // add mark only if valid
        }
        average = (double) sum / numstudents;
        System.out.printf("The average is: %.2f%n", average);
        sc.close();
    }
}