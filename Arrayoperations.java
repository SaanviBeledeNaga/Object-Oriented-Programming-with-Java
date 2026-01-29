import java.util.Scanner;
public class Arrayoperations
{ 
	public static void reverse(int[] arr),
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size= sc.nextInt();
		int [] arr= new int[size]; //array creation
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt(); //reading an array	
		}
		reverse(arr);
	}	
}				