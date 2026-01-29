import java.util.Scanner;
public class CircleComputation
{
	public static void main(String[] args)
	{
		double radius, diameter, circumference, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("type the radius value: ");
		radius = sc.nextDouble();
		diameter=2*radius;
		circumference=2*Math.PI*radius;
		area=Math.PI*radius*radius;
		System.out.printf("The diameter is: %.2f%n", diameter);
		System.out.printf("The circumfernece is: %.2f%n", circumference);
		System.out.printf("The area is: %.2f%n", area);
	}
}	