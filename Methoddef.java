public class Methoddef
{
	public void max(int x, int y) //method definition
	{
		if (x>y)
			System.out.println(x);
		else
			System.out.println(y);
	}
	public static void main(String[] args)
	{
		Methoddef ob1=new Methoddef();
		ob1.max(10,20); //method calling
	}
}	