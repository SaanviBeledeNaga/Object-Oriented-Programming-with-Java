interface SuperClass1
{
	void show();
}
interface SuperClass2
{
	void display();
}
class SubClass implements SuperClass1, SuperClass2
{
	public void show()
	{
		System.out.println("this is from SuperClass1");
	}
	public void display()
	{
		System.out.println("this is from SuperClass2");
	}
}
class Multiinheritance
{
	public static void main(String[] args)
	{
		SubClass sb = new SubClass();
		sb.show();
		sb.display();
	}
}