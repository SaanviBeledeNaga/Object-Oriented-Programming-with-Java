public class Stringmethods
{
	public static void main(String[] args)
	{
		//using string literal
		String s = "Hello World";
		
		//finding length
		int n = s.length(); 
		System.out.println(s);
		System.out.println(n);
		
		//using charAt and extracting each character in string
		for(int i=0;i<n;i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
		}
		
		//using substring
		String s2 = s.substring(1);
		System.out.println(s2);
		String s3 = s.substring(0,5);
		System.out.println(s3);
		
		//printing reverse of a string 
		for(int j=n-1;j>=0;j--)
		{
			char r = s.charAt(j);
			System.out.println(r);
		}
		
		//finding palindrome
		String p1 = "racecar";
		int t = p1.length();
		String rev="";
		for(int k=t-1;k>=0;k--)
		{
			char q = p1.charAt(k);
			rev+=q;
		}
		if(p1.equals(rev))///using equals
		{
			System.out.println("it is a palindrome");
		}
		else 
		{
			System.out.println("it is not a palindrome");
		}
		
		//counting the number of vowels
		String vowels = "aeiou";
		String v1 = "hello world";
		int l = v1.length();
		int cnt = 0;
		for(int m=0;m<l-1;m++)
		{
			char ch = v1.charAt(m);
			if(vowels.contains(""+ch))
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
			
}
	