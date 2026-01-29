import java.util.Scanner; 
public class CheckBinStr 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        String inStr;     // Input string 
        int inStrLen;     // Length of the string 
        char inChar;      // Each character of the string 
        boolean isValid;  // Flag to check if valid binary string 
        System.out.print("Enter a binary string: "); 
        inStr = in.nextLine(); 
        inStrLen = inStr.length(); 
        isValid = true; 
        for (int i = 0; i < inStrLen; i++) 
		{ 
            inChar = inStr.charAt(i); 
            if (!(inChar == '0' || inChar == '1')) 
			{ 
                isValid = false; 
                break;  // Stop checking once invalid character found 
            } 
        } 
        if (isValid) 
		{ 
            System.out.println("\"" + inStr + "\" is a binary string."); 
        } 
		else 
		{ 
            System.out.println("\"" + inStr + "\" is NOT a binary string."); 
        } 
        in.close(); 
    } 
} 
