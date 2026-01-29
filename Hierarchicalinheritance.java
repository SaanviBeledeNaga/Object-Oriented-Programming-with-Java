class Shapes
{
	void figure()
	{
		System.out.println("I'm a simple closed figure");
	}
}
class Circle extends Shapes 
{
	void circumference()
	{
		System.out.println("My circumference is 2*pi*r");
	}
}
class Rectangle extends Shapes 
{
	void perimeter()
	{
		System.out.println("My perimeter is 2*(l+b)");
	}
}
class Triangle extends Shapes 
{
	void area()
	{
		System.out.println("My area is 1/2*base*height");
	}
}
class Hierarchicalinheritance
{
	public static void main(String[] args)
	{
		Circle cr = new Circle();
		Rectangle rt = new Rectangle();
		Triangle tg = new Triangle();
		cr.figure();
		cr.circumference();
		rt.figure();
		rt.perimeter();
		tg.figure();
		tg.area();
	}
}