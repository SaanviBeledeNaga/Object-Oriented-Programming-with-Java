import java.util.Scanner; 
 
public class TestPalindromicPhrase 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a phrase: "); 
        String phrase = in.nextLine(); 
        phrase = phrase.toLowerCase(); 
        int fIdx = 0; 
        int bIdx = phrase.length() - 1; 
        boolean isPalindrome = true; 
        while (fIdx < bIdx) 
		{ 
            char frontChar = phrase.charAt(fIdx); 
            char backChar = phrase.charAt(bIdx); 
            if (!Character.isLetter(frontChar)) 
			{ 
                fIdx++; 
                continue; 
            } 
            if (!Character.isLetter(backChar)) 
			{ 
                bIdx--; 
                continue; 
            } 
            if (frontChar != backChar) 
			{ 
                isPalindrome = false; 
                break; 
            } 
 
            fIdx++; 
            bIdx--; 
        } 
        if (isPalindrome) 
            System.out.println("\"" + phrase + "\" is a palindromic phrase."); 
        else 
            System.out.println("\"" + phrase + "\" is not a palindromic phrase."); 
        in.close(); 
    } 
} 
