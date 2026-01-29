class Animal 	
{
	void eat()
	{
		System.out.println("This animal eats food");
	}
}
class Dog extends Animal
{
	void run()
	{
		System.out.println("Dog runs at higher speeds");
	}
}
class Singleinheritance
{
	public static void main(String[] args)
	{
		Dog dg = new Dog();
		dg.eat();
		dg.run();
	}
}