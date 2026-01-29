public class Append
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
