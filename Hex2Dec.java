import java.util.Scanner; 
public class Hex2Dec 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        String hexStr; 
        int hexStrLen; 
        char inChar; 
        boolean isValid = true; 
        int decimal = 0; 
        System.out.print("Enter a hexadecimal string: "); 
        hexStr = in.nextLine(); 
        hexStrLen = hexStr.length(); 
        for (int i = 0; i < hexStrLen; i++) 
		{ 
            inChar = hexStr.charAt(i); 
            if (!((inChar >= '0' && inChar <= '9') || 
                  (inChar >= 'A' && inChar <= 'F') || 
                  (inChar >= 'a' && inChar <= 'f'))) 
			{ 
                isValid = false; 
                break; 
            } 
        } 
        if (!isValid) 
		{ 
            System.out.println("\"" + hexStr + "\" is NOT a hexadecimal string."); 
        } 
		else 
		{ 
            for (int i = 0; i < hexStrLen; i++) 
			{ 
                inChar = hexStr.charAt(i); 
                int digitValue; 
                if (inChar >= '0' && inChar <= '9') 
				{ 
                    digitValue = inChar - '0'; 
                } 
				else if (inChar >= 'A' && inChar <= 'F') 
				{ 
                    digitValue = 10 + (inChar - 'A'); 
                } 
				else 
				{ 
                    digitValue = 10 + (inChar - 'a'); 
                } 
                decimal = decimal * 16 + digitValue; 
            } 
			 System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + decimal); 
        } 
        in.close(); 
    } 
} 
