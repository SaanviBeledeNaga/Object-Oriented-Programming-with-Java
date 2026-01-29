import java.util.*; 
public class AutomorphicNumber 
{ 
    public static boolean isAutomorphic(int n) 
	{ 
        int square = n * n; 
        String numStr = Integer.toString(n); 
        String squareStr = Integer.toString(square); 
        return squareStr.endsWith(numStr); 
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number : "); 
        int n = sc.nextInt(); 
        if (isAutomorphic(n)) 
            System.out.println(n + " is a Automorphic Number"); 
        else 
            System.out.println(n + " is not a Automorphic Number"); 
        sc.close(); 
    } 
} 
