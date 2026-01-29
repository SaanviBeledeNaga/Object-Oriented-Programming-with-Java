import java.util.Scanner; 
public class Bin2Dec 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        String binStr;        // Input binary string 
        int binStrLen;        // Length of the string 
        char inChar;          // Each character 
        boolean isValid = true; 
        int decimal = 0;      // Resulting decimal value 
        System.out.print("Enter a binary string: "); 
        binStr = in.nextLine(); 
        binStrLen = binStr.length(); 
        for (int i = 0; i < binStrLen; i++) 
		{ 
            inChar = binStr.charAt(i); 
            if (!(inChar == '0' || inChar == '1')) 
			{ 
                isValid = false; 
                break; 
            } 
        } 
        if (!isValid) 
		{ 
            System.out.println("\"" + binStr + "\" is NOT a binary string."); 
        } 
		else 
		{ 
            for (int i = 0; i < binStrLen; i++) 
			{ 
                inChar = binStr.charAt(i); 
                decimal = decimal * 2 + (inChar - '0'); 
            } 
            System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + decimal); 
        } 
        in.close(); 
    } 
} 
