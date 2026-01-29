public class Method$3
{
	public boolean isOdd(int n)
	{ 
		if (n%2!= 0)
			return true;
		else 
			return false;
	}
	public void main(String[] args)
	{ 
		Method$3 ob1  = new Method$3();
		boolean x=ob1.isOdd(9);
		System.out.println(x);
	}
}