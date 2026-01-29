import java.util.Scanner; 
public class RunningNumberSequenceLength 
{ 
	public static int numOfDigits(int n) 
	{ 
		return Integer.toString(n).length(); 
	} 
	public static int lenRecursive(int n) 
	{ 
		if (n == 1) 
		{ 
			return 1;  
		} 
		return lenRecursive(n - 1) + numOfDigits(n); 
	} 
	public static int lenIterative(int n) 
	{ 
		int length = 0; 
		for (int i = 1; i<= n; i++) 
		{ 
			length += numOfDigits(i); 
		} 
		return length; 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter n: "); 
		int n = sc.nextInt(); 
		System.out.println("Length using recursive method: " + lenRecursive(n)); 
		System.out.println("Length using iterative method: " + lenIterative(n)); 
		sc.close(); 
	} 
}