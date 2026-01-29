public class Operations
{
	public static void main(String[] args)
	{
		//25-08-2025
		//arithmetic operators
		int num1=5;
		int num2=8;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		//unary operators
		int a=10;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(++a + --a);
		//assignment operators
		int x=7;
		System.out.println(x+=7);
		System.out.println(x-=7);
		//relational operators
		int p=14;
		int q=15;
		System.out.println(p==q);
		System.out.println(p!=q);
		System.out.println(p<q);
		System.out.println(p>q);
		System.out.println(p<=q);
		System.out.println(p>=q);
		//logical operators
		int r=3;
		int s=13;
		System.out.println(r<s && r<=s);
		System.out.println(r<s || r>=s);
		System.out.println(!(r<s));
		//bitwise operators
		int t=9;
		int u=19;
		System.out.println(t&u);
		System.out.println(t|u);
		System.out.println(t^u);
		System.out.println(~u);
		System.out.println(~t);
		//shift operators
		int v=20;
		System.out.println(v<<1);
		System.out.println(v>>1);
		//ternary operators
		System.out.println((8%2==0)? "Yes":"No");
	}
}
