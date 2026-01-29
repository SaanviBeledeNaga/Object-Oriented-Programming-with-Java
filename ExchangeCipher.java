import java.util.Scanner; 
class ExchangeCipher 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a plaintext string: "); 
        String inStr = sc.next().toUpperCase(); 
        int strLen = inStr.length(); 
        System.out.print("The ciphertext string is: "); 
        for (int i = 0; i < strLen; i++) 
		{ 
            char ch = inStr.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
			{ 
                ch = (char) ('A' + 'Z' - ch); 
            } 
            System.out.print(ch); 
        } 
        System.out.println(); 
    } 
} 
