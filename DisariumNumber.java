import java.util.Scanner; 
public class DisariumNumber 
{ 
    public static int countDigits(int n) 
	{ 
        int count = 0; 
        while (n != 0) { 
            count++; 
            n /= 10; 
        } 
    return count; 
    } 
    public static boolean isDisarium(int n) 
	{ 
        int num = n; 
        int digits = countDigits(n); 
        int sum = 0; 
        while (num != 0) { 
            int digit = num % 10; 
            sum += Math.pow(digit, digits); 
            num /= 10; 
            digits--;  
        } 
        return sum == n; 
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = sc.nextInt(); 
        if (isDisarium(number)) 
            System.out.println(number + " is a Disarium Number"); 
        else 
            System.out.println(number + " is not a Disarium Number"); 
        sc.close(); 
    } 
} 

