public class Printing
{ 
	public static void main(String[] args)
	{ 
	 int x=10, y=20;
	 float pi=3.14257f;
	 System.out.printf("x=%d, y=%d%n",x,y);
	 System.out.printf("pi=%.2f%n", pi);
	 System.out.printf("Name=%s,age=%d,salary=%f%n","ravi",10,600000.30);
	 //padding and alignment
	 System.out.printf("|%10s|%n","Java");
	 System.out.printf("|%-10s|%n","Java");	
	//printing the below statement
	 System.out.printf("c://users");
	}
}
