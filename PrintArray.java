import java.util.*;
public class PrintArray 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of items:");  
		int n=sc.nextInt(); 
		int arr[]=new int[n]; 
		System.out.print("Enter the value of items:");  
		for(int i=0;i<arr.length;i++) 
		{ 
			arr[i]=sc.nextInt(); 
		}
			System.out.print("The value stored are:[ ");  
			for(int i=0;i<arr.length;i++) 
			{ 
				System.out.print(arr[i]); 
				if(i<n-1) 
				{     
					System.out.print(", "); 
				} 
			} 
			System.out.print("]"); 	
	} 
}