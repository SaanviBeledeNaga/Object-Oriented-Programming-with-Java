public class Array
{
	public static void main(String[] args)
	{ 
		int[] age= {12, 4, 5, 2, 5};
		for(int i=0;i<=4;i++)
		{
		System.out.println(age[i]); //or System.out.println(age[i]+" "); to get in same line
		}
		String cars[]=new String[5];
		cars[0]="volvo";
		cars[1]="mercedes";
		cars[2]="porsche";
		cars[3]="skoda";
		cars[4]="audi";
		int n=cars.length;
		for(int i=0;i<cars.length;i++)S
		{
			System.out.println(cars[i]+" "); //for loop
		}
		for(String a : cars)
		{ 
			System.out.println(a); //for each loop
		}
		
	}
}
	
	
		
		