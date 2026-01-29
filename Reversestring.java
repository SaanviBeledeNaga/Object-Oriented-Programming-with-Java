public class Reversestring
{
	public static void main(String[] args)
	{
		String s1="welcome";
		int len=s1.length();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		String s2="mom";
		int len=s2.length();
		for(int j=s2.length()-1;j>=0;j--)
		{ 
			System.out.print(s2.chartAt(j));
		}
	}
}