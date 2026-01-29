public class Stringbuilder
{
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello");
		sb1.append(" World");
		sb1.insert(11," Java");
		sb1.replace(12, 16, "Python");
		sb1.delete(11, 14);
		sb1.reverse();
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder(30);
		sb2.append("This has initial capacity 30");
		System.out.println(sb2);
		StringBuilder sb3 = new StringBuilder("Hi I'm from");
		sb3.append(" IARE College");
		System.out.println(sb3);
		CharSequence cs = "Java";
		StringBuilder sb4 = new StringBuilder(cs);
		sb4.append(" Programming at IT park");
		System.out.println(sb4);
		
		int c1 = sb1.capacity();
		System.out.println("sb1 capacity is " + c1);
		int c2 = sb2.capacity();
		System.out.println("sb2 capacity is " + c2);
		int c3 = sb3.capacity();
		System.out.println("sb3 capacity is " + c3);
		int c4 = sb4.capacity();
		System.out.println("sb4 capacity is " + c4);
	}
}