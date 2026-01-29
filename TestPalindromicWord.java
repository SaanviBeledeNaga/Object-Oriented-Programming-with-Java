import java.util.Scanner; 
public class TestPalindromicWord 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a word: "); 
        String word = in.nextLine(); 
        String lowerWord = word.toLowerCase(); 
        int len = lowerWord.length(); 
        boolean isPalindrome = true; 
        for (int i = 0; i < len / 2; i++) { 
            if (lowerWord.charAt(i) != lowerWord.charAt(len - 1 - i)) 
			{ 
                isPalindrome = false; 
                break; 
            } 
        } 
        if (isPalindrome) 
            System.out.println("\"" + word + "\" is a palindrome."); 
        else 
            System.out.println("\"" + word + "\" is not a palindrome."); 
        in.close(); 
    } 
}