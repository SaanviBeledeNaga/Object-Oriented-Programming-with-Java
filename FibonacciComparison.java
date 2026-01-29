import java.util.Scanner; 
public class FibonacciComparison 
{ 
	public static int fibonacciRecursive(int n) 
	{ 
		if (n == 0) 
		{ 
			return 0;   
		} 
		else if (n == 1) 
		{ 
		return 1;  
		} 
		else 
		{ 
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); 
		} 
	} 
	public static int fibonacciIterative(int n) 
	{ 
		if (n == 0) 
		{ 
			return 0; 
		} 
		int f1 = 0, f2 = 1, f3 = 1; 
		for (int i = 2; i<= n; i++) 
		{ 
			f3 = f1 + f2; 
			f1 = f2; 
			f2 = f3; 
		} 
		return f3; 
	} 
	public static void main(String[] args) 
	{ 
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter n (non-negative integer): "); 
	int n = sc.nextInt(); 
	if (n < 0) 
	{ 
		System.out.println("Fibonacci is not defined for negative numbers."); 
	}  
	else 
	{ 
		int recursiveResult = fibonacciRecursive(n); 
		int iterativeResult = fibonacciIterative(n); 
		System.out.println("Fibonacci (Recursive) of " + n + " = " + recursiveResult); 
		System.out.println("Fibonacci (Iterative) of " + n + " = " + iterativeResult); 
	} 
	sc.close(); 
	} 
}