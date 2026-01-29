import java.util.Scanner; 
public class AmicableNumbers 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
		System.out.print("Enter 1st number:"); 
        int a = sc.nextInt(); 
		System.out.print("Enter 2nd number:"); 
        int b = sc.nextInt(); 
        sc.close(); 
        int sumA = sumOfDivisors(a); 
        int sumB = sumOfDivisors(b); 
        if (sumA == b && sumB == a && a != b) 
		{ 
            System.out.println("The numbers are Amicable Numbers."); 
        } 
		else 
		{ 
            System.out.println("The numbers are Not Amicable Numbers."); 
        } 
    } 
    static int sumOfDivisors(int n) 
	{ 
        int sum = 1; 
        for (int i = 2; i <= n / 2; i++) 
		{ 
            if (n % i == 0) sum += i; 
        } 
        return sum; 
    } 
}