import java.util.Scanner; 
class CountVowelsDigits 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a String: "); 
        String inStr = sc.next().toLowerCase(); 
        int strLen = inStr.length(); 
        int vowelCount = 0; 
        int digitCount = 0; 
        for (int i = 0; i < strLen; i++) 
		{ 
            char ch = inStr.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{ 
                vowelCount++; 
            } 
			else if (Character.isDigit(ch)) 
			{ 
                digitCount++; 
            } 
        } 
        double vowelPercent = (vowelCount * 100.0) / strLen; 
        double digitPercent = (digitCount * 100.0) / strLen; 
        System.out.printf("Number of vowels: %d (%.2f%%)%n", vowelCount, vowelPercent); 
        System.out.printf("Number of digits: %d (%.2f%%)%n", digitCount, digitPercent); 
    } 
} 
