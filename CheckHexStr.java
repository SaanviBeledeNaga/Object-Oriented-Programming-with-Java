import java.util.Scanner; 
public class CheckHexStr 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        String inStr;     // Input string 
        int inStrLen;     // Length of the string 
        char inChar;      // Each character of the string 
        boolean isValid;  // Flag to check if valid hex string 
        System.out.print("Enter a hex string: "); 
        inStr = in.nextLine(); 
        inStrLen = inStr.length(); 
        isValid = true;  
        for (int i = 0; i < inStrLen; i++) 
		{ 
            inChar = inStr.charAt(i); 
            // Check if NOT in range '0'-'9', 'A'-'F', or 'a'-'f' 
            if (!((inChar >= '0' && inChar <= '9') || 
                  (inChar >= 'A' && inChar <= 'F') || 
                  (inChar >= 'a' && inChar <= 'f'))) { 
                isValid = false; 
                break; // Stop checking after first invalid char 
            } 
        } 
        if (isValid) 
		{ 
            System.out.println("\"" + inStr + "\" is a hex string."); 
        } 
		else 
		{ 
            System.out.println("\"" + inStr + "\" is NOT a hex string."); 
        } 
        in.close(); 
    } 
}