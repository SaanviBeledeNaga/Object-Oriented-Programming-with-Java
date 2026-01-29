import java.util.*;
class Main3
{
	public static void main(String[] args)
	{
		Set<String>h = new HashSet<String>();
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("E");
		h.add("B");
		h.add("C");
		Set<String>g = new HashSet<String>();
		g.add("A");
		g.add("B");
		g.add("F");
		g.add("G");
		g.add("H");
		h.addAll(g);
		for(String value: h)
			{
			System.out.print(value+", ");
			}
		System.out.println();
		System.out.println(h.size());
	}
}

