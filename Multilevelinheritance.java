class Tree
{
	void fruit()
	{
		System.out.println("This tree gives fruits");
	}
}
class Kesar extends Tree
{
	void mangoInd()
	{
		System.out.println("This is Indian Mango");
	}
}
class Alphonso extends Kesar
{
	void mangoUSA()
	{
		System.out.println("This is USA Mango");
	}
}
class Multilevelinheritance
{
	public static void main(String[] args)
	{
		Alphonso alp = new Alphonso();
		alp.fruit();
		alp.mangoInd();
		alp.mangoUSA();
	}
}
