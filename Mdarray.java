public class Mdarray
{
	public static void main(String[] args)
	{
		int[][] marks= {{77,85,68},{98,56,79},{78,88,56}};
			{
				System.out.println(marks[1][1]); //to display one element using indices. 
			}
		marks[2][2]=99; //to change value of an element.
		for(int row=0;row<=2;row++)
		{
			for(int col=0;col<=2;col++)
			{
				System.out.print(marks[row][col]+" ");
			}
			{
			System.out.println(); //to get all element in a single, vertical line.
			}
		}
	}
}
	