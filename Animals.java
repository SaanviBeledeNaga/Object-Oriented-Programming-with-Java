class AnimalsIn
{
	void eat()
	{
		System.out.println("Animals are eating"); //using extends
	}
}
class Dog extends AnimalsIn
{
	@Override
	void eat()
	{
		System.out.println("Dog is eating");
	}
}
class Cat extends AnimalsIn 
{
	@Override
	void eat()
	{
		System.out.println("Cat is eating");
	}
}
class Animals 
{
	public static void main(String[] args)
	{
		Dog dg = new Dog();
		dg.eat();
		Cat ct = new Cat();
		ct.eat();
	}
}