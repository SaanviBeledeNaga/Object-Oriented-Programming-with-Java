public class VariableTypes
{
	String name; //instance variable
	int rollNo; //instance variable
	static String collegename="iare"; //static variable
	public static void main(String[] args)
	{
		VariableTypes st1 = new VariableTypes();
		st1.name = "Keerthi";
		st1.rollNo = 43;
		collegename="iare";
		int marks=70; //local variable
		System.out.println(st1.name+" "+ st1.rollNo+ collegename+ marks);
	}
}