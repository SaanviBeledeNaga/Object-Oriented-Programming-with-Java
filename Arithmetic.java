public class Arithmetic
{ 
	public static void main(String[] args) 
	{ 
		String s1 = "+";
		String s2 = "-";
		String s3 = "*";
		String s4 = "/";
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(s1.equals(args[2]))
		{
			System.out.print(a+b);
		}
		else if(s2.equals(args[2]))
		{
			System.out.print(a-b);
		}
		else if(s3.equals(args[2]))
		{
			System.out.print(a*b);
		}
		else if(s4.equals(args[2]))
		{
			System.out.print(a/b);
		}
		else
		{
			System.out.print("Not a valid statement");
		}
	}
}
	
		