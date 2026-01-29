import java.util.Scanner; 
public class MagicNumber 
{ 
    public static int sumOfDigits(int n) 
	{ 
        int sum = 0; 
        while (n != 0) 
		{ 
            sum += n % 10; 
            n /= 10; 
		} 
        return sum; 
    } 
    public static boolean isMagicNumber(int n) 
	{ 
        int result = n; 
        while (result > 9) 
		{  
            result = sumOfDigits(result); 
        } 
        return result == 1; 
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = sc.nextInt(); 
        if (isMagicNumber(number)) 
            System.out.println(number + " is a Magic Number"); 
        else 
            System.out.println(number + " is not a Magic Number"); 
        sc.close(); 
    } 
}