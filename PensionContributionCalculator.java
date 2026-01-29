import java.util.Scanner;
public class PensionContributionCalculator
{  
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter employee age: ");
		double age = sc.nextDouble();
		System.out.print("Enter employee salary (or enter -1 to end): ");
		double salary = sc.nextDouble();
		double employeeRate;  
		double employerRate;
		int SENTINEL= -1;
		while(SENTINEL!=salary)
		{
			if (age<=55)  
			{  
				employeeRate=20.0;
				employerRate=17.0;
			}  
			else if(age>55 && age<=60)
			{  
				employeeRate=13.0;
				employerRate=13.0;
			}  
			else if(age>60 && age<=65)
			{  
				employeeRate=7.5;
				employerRate=9.0;
			}  
			else 
			{  
				employeeRate=5.0;
				employerRate=7.0;
			}  
				double employeeContribution = salary*(employeeRate/100);  
				double employerContribution = salary*(employerRate/100);  
				double totalContribution = employeeContribution+employerContribution;
				System.out.printf("Employee Contritbution: $%.2f%n" ,employeeContribution);
				System.out.printf("Employer Contritbution: $%.2f%n" ,employerContribution);
				System.out.printf("Total Contritbution: $%.2f%n" ,totalContribution);
				System.out.print("Enter employee age: ");
				age = sc.nextInt();
				System.out.print("Enter employee salary (or enter -1 to end): ");
				salary = sc.nextDouble();
		}
  }  
}
		