import java.util.Scanner; 
class CaesarCode 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a plaintext string: "); 
        String inStr = sc.next(); 
        int strLen = inStr.length(); 
        System.out.print("The ciphertext string is: "); 
        for (int i = 0; i < strLen; i++) { 
            char ch = Character.toUpperCase(inStr.charAt(i)); 
            if (ch >= 'A' && ch <= 'Z') 
			{ 
                ch = (char) (((ch - 'A' + 3) % 26) + 'A'); 
            } 
            System.out.print(ch); 
        } 
        System.out.println(); 
    } 
}