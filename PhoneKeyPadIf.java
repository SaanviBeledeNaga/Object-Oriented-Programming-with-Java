import java.util.Scanner; 
class PhoneKeyPadIf 
{ 
    public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a String: "); 
        String inStr = sc.next().toLowerCase(); 
        int strLen = inStr.length(); 
        System.out.print("Keypad sequence: "); 
        for (int i = 0; i < strLen; i++) 
		{ 
            char ch = inStr.charAt(i); 
            if (ch >= 'a' && ch <= 'c') 
			{ 
                System.out.print(2); 
            } 
			else if (ch >= 'd' && ch <= 'f') 
			{ 
                System.out.print(3); 
            } 
			else if (ch >= 'g' && ch <= 'i') 
			{ 
                System.out.print(4); 
            } 
			else if (ch >= 'j' && ch <= 'l') 
			{ 
                System.out.print(5); 
            } 
			else if (ch >= 'm' && ch <= 'o') 
			{ 
                System.out.print(6); 
            } 
			else if (ch >= 'p' && ch <= 's') 
			{ 
                System.out.print(7); 
            } 
			else if (ch >= 't' && ch <= 'v') 
			{ 
                System.out.print(8); 
            } 
			else if (ch >= 'w' && ch <= 'z') 
			{ 
                System.out.print(9); 
            } 
			else 
			{ 
                System.out.print(ch);  
            } 
        } 
        System.out.println(); 
    } 
} 
