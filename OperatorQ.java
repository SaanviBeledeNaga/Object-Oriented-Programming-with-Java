import java.util.Scanner;
public class  OperatorQ
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		int a= sc.nextInt();
		System.out.println("enter b value");
		int b= sc.nextInt();
		System.out.println("enter the operator value");
		int Operator= sc.nextInt();
		if(Operator==1){
			System.out.println(a+b);
		}
		else if(Operator==2){ 
			System.out.println(a-b);
		}
		else if(Operator==3){ 
			System.out.println(a*b);
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}		