import java.util.Scanner; 
class DecipherCaesarCode 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a ciphertext string: "); 
        String inStr = sc.next(); 
        int strLen = inStr.length(); 
        System.out.print("The plaintext string is: "); 
        for (int i = 0; i < strLen; i++) 
		{ 
            char ch = Character.toUpperCase(inStr.charAt(i)); 
            if (ch >= 'A' && ch <= 'Z') 
			{ 
                ch = (char) (((ch - 'A' - 3 + 26) % 26) + 'A'); 
            } 
            System.out.print(ch); 
        } 
        System.out.println(); 
    } 
} 
