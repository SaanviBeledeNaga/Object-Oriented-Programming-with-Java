public class Control 
{
		public static void main(String[] args)
		{
			//26-08-2025
			//simple if
				int age=32;
				if(age>18)
				{
					System.out.println("eligible for vote");
				}
					System.out.println("out of if block");
			//if-else
				int A=22;
				if(A%2 == 0)
				{
					System.out.println("even number");
				}
				else
				{
					System.out.println("odd number");
				}
			//if-else-if
				int marks=92;
				if(marks>90)
				{
					System.out.println("A Grade");
				}
				else if(marks>80 && marks<90)
				{ 
					System.out.println("B Grade");
				}
				else if(marks>70 && marks<80)
				{
					System.out.println("C Grade");
				}
				else if(marks>60 && marks<70)
				{
					System.out.println("D Grade");
				}
				else
				{
					System.out.println("E Grade");
				}
			//nested-if 
			String indian="resdient";
			int X=35;
			if (indian=="resident");
			{
				if(X>18)
				{
					System.out.println("you are eligible to vote");
				}
			else
			{ 
				System.out.println("not eligible");
			}
			}
			//switch
			int day=5;
			switch(day)
			{
				case 1:
				System.out.println("Monday");
				break;
				case 2:
				System.out.println("Tuesday");
				break;
				case 3:
				System.out.println("Wednesday");
				break;
				case 4:
				System.out.println("Thursday");
				break;
				case 5:
				System.out.println("Friday");
				break;
				case 6:
				System.out.println("Saturday");
				break;
				case 7:
				System.out.println("Sunday");
				break;
				default:
				System.out.println("no cases matched");
			}	
		}
}