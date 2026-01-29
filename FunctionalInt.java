interface Calculator
{
	int add(int a,int b);
}
public class FunctionalInt
{
	public static void main(String[] args)
	{
	Calculator c = (x,y) -> x+y;
	System.out.println("Sum = " + c.add(10,20));
	}
}