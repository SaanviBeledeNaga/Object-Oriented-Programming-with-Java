import java.util.*;
class Main4
{
	public static void main(String[] args)
	{
		Set<String>h = new HashSet<String>();
		h.add("A");
		h.add("D");
		h.add("D");
		h.add("E");
		h.add("C");
		h.add("B");
		for(String value: h)
			{
			System.out.print(value+", ");
			}
		System.out.println();
		Set<String>g = new LinkedHashSet<String>();
		g.add("A");
		g.add("B");
		g.add("D");
		g.add("E");
		g.add("B");
		g.add("C");
		for(String value: g)
			{
			System.out.print(value+", ");
			}
		System.out.println();
		Set<String>i = new TreeSet<String>();
		i.add("A");
		i.add("B");
		i.add("D");
		i.add("E");
		i.add("B");
		i.add("C");
		for(String value: i)
			{
			System.out.print(value+", ");
			}
		System.out.println();
	}
}
