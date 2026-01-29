import java.util.*;
public class PrintArrayInStars 
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
		for(int i=0;i<arr.length;i++) 
		{ 
			System.out.print(i+": "); 
			for(int j=0;j<arr[i];j++) 
			{ 
				System.out.print("*"); 
			}   
			System.out.print("("+arr[i]+")\n");  
		} 
	} 
}