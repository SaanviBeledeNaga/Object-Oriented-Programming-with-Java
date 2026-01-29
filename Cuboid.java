//Cuboid.java
class Cuboid 
{
	//28-08-2025 using classes and objects to find the volume and area of a cuboid.
	int length;
	int width;
	int height;
	int volume()
	{ return length*width*height;
	}
	int area()
	{ return 2*length*width + 2*width*height + 2*height*length;
	}
	public static void main(String[] args)
	{
		Cuboid cu1 = new Cuboid();
		cu1.length = 10;
		cu1.width = 20;
		cu1.height = 30;
		System.out.println(cu1.volume());		
		System.out.println(cu1.area());
		Cuboid cu2 = new Cuboid();
		cu2.length = 40;
		cu2.width = 50;
		cu2.height = 60;
		System.out.println(cu2.volume());
		System.out.println(cu2.area());
	}
}