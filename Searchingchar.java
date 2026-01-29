public class Searchingchar
{
	public static void main(String[] args)
	{
		String s ="abcabcabcabcabc";
		int n = s.indexOf('b'); //first occurence of b
		System.out.println(n);
		int o = s.indexOf('b',n+1); //second occurence of b
		System.out.println(o);
		int l = s.lastIndexOf('b'); //last occurence of b
		System.out.println(l); 
		String s1 = s.substring(0,13); //second last occurence of b
		int p = s1.lastIndexOf('b');
		System.out.println(p);
	}
}

	