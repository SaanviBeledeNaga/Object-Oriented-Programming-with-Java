import java.util.*;
public class Main5	
{
	public static void main(String[] args)
	{
		Map<String, Integer> m = new HashMap<>();
		m.put("Geek1", 1);
		m.put("Geek2", 2);
		m.put("Geek3", 3);
		System.out.println("Map elements: " +m);
		System.out.println(m.get("Geek2"));
		System.out.println(m.get("Geek8"));
	}
}

   	