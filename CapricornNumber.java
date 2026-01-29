import java.util.Scanner; 
public class CapricornNumber 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number : "); 
        int num = sc.nextInt(); 
        sc.close(); 
        int square = num * num; 
        String sqStr = String.valueOf(square); 
        boolean isKaprekar = false; 
        for (int i = 1; i < sqStr.length(); i++) 
		{ 
            int left = Integer.parseInt(sqStr.substring(0, i)); 
            int right = Integer.parseInt(sqStr.substring(i)); 
            if (right != 0 && (left + right) == num) 
			{ 
                isKaprekar = true; 
                break; 
            } 
        } 
        if (num == 1) isKaprekar = true; // 1 is a Kaprekar number 
        if (isKaprekar) 
		{ 
            System.out.println(num + " is a Capricorn/Kaprekar number"); 
        } 
		else 
		{ 
            System.out.println(num + " is not a Capricorn/Kaprekar number"); 
        } 
    } 
} 
