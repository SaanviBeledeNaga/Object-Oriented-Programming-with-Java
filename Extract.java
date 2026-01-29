import java.util.Scanner;
class Extract
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);//scanner class object
		System.out.println("enter name,age,salary");
		int age=sc.nextInt();
		float salary=sc.nextFloat();
		String name=sc.next();
		System.out.println("name:"+name+" "+"age"+age+" "+"salary"+salary);
	}
}