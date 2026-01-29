import java.util.Scanner; 
public class PalindromicNumber 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        int original = num; 
        int reverse = 0; 
        while (num > 0) 
		{ 
            int digit = num % 10;       // Extract last digit 
            reverse = (reverse * 10) + digit; // Build reversed number 
            num /= 10;                  // Remove last digit 
        } 
        if (original == reverse) 
            System.out.println(original + " is a Palindromic Number"); 
        else 
            System.out.println(original + " is not a Palindromic Number"); 
        sc.close(); 
    } 
}