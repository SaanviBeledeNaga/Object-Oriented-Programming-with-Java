interface Methods
{
	//abstract methods
	void abstractMethod1();
	void abstractMethod2();
	//default method
	default void defaultMethod()
	{
		System.out.println("Default Method");
	}
	//static method 
	static void staticMethod()
	{
		System.out.println("Static Method");
	}
}
class Test1 implements Methods
{
	public void abstractMethod1()
	{
		System.out.println("Abstract Method1 implemented");
	}
}
class Test2 implements Test1
{ 
	public void abstractMethod2()
	{
		System.out.println("Abstract Method2 implemented");
	}
}
public class InterfaceMethods
{
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.abstractMethod1();
		t2.abstractMethod2();
		t1.defaultMethod();
		Methods.staticMethod();
	}
}
