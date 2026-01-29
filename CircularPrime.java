import java.util.*; 
 public class CircularPrime 
 { 
    public static boolean isPrime(int n) 
	{ 
        if (n < 2) return false; 
        if (n % 2 == 0) return n == 2; 
        int r = (int) Math.sqrt(n); 
        for (int i = 3; i <= r; i += 2) 
		{
        if (n % i == 0)
			return false; 
		}
        return true; 
    } 
    public static boolean isCircularPrime(int n) 
	{ 
        String s = Integer.toString(n); 
        for (int i = 0; i < s.length(); i++) 
		{ 
            int rotated = Integer.parseInt(s.substring(i) + s.substring(0, i)); 
            if (!isPrime(rotated)) 
            return false; 
        } 
		return true; 
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number : "); 
        int n = sc.nextInt();
        if (isCircularPrime(n)) 
            System.out.println(n + " is a Circular Prime"); 
        else 
            System.out.println(n + " is not a Circular Prime"); 
        sc.close(); 
    } 
}