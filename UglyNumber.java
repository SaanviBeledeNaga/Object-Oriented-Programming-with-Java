import java.util.Scanner; 
public class UglyNumber 
{ 
    public static boolean isUgly(int num) 
	{ 
        if (num <= 0) 
            return false; 
        while (num % 2 == 0) 
            num /= 2; 
        while (num % 3 == 0) 
            num /= 3; 
        while (num % 5 == 0) 
            num /= 5;  
    } 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = sc.nextInt(); 
        if (isUgly(n)) 
            System.out.println(n + " is an Ugly Number"); 
        else 
            System.out.println(n + " is not an Ugly Number");
        sc.close(); 
    } 
}