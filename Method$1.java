public class Method$1
{
	public int returnValueFunction(int n)
		{ 
			return 2*n;
		}
	public int argumentFunction(int x, int y)
		{
			return x+y;
		}
	public static void main(String[] args)
	{
		Method$1 ob1= new Method$1();
		int ans=ob1.returnValueFunction(10);
		int add=ob1.argumentFunction(10,20);
		System.out.printf("ans=%d, add=%d%n", ans,add);
	}
}
