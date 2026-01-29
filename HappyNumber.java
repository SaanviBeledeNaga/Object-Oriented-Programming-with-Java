import java.util.*; 
public class HappyNumber 
{ 
    public static int sumOfSquares(int n) 
	{ 
        int sum = 0; 
        while (n > 0) 
		{
        int digit = n % 10; 
        sum += digit * digit; 
        n /= 10; 
        } 
        return sum; 
    } 
    public static boolean isHappy(int n) 
	{ 
        Set<Integer> seen = new HashSet<>(); 
        while (n != 1 && !seen.contains(n)) 
		{ 
            seen.add(n); 
            n = sumOfSquares(n); 
        } 
        return n == 1; 
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number : "); 
        int n = sc.nextInt(); 
        if (isHappy(n)) 
            System.out.println(n + " is a Happy number"); 
        else 
            System.out.println(n + " is not a Happy number"); 
        sc.close(); 
    } 
} 
