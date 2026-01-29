import java.util.Scanner; 
public class Oct2Dec 
{ 
    public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in); 
        String octStr; 
        int octStrLen; 
        char inChar; 
        boolean isValid = true; 
        int decimal = 0; 
        System.out.print("Enter an octal string: "); 
        octStr = in.nextLine(); 
        octStrLen = octStr.length(); 
        for (int i = 0; i < octStrLen; i++) 
		{ 
            inChar = octStr.charAt(i); 
            if (!(inChar >= '0' && inChar <= '7')) 
			{ 
                isValid = false; 
                break; 
            } 
        } 
        if (!isValid) 
		{ 
            System.out.println("\"" + octStr + "\" is NOT an octal string."); 
        } 
		else 
		{ 
            for (int i = 0; i < octStrLen; i++) 
			{ 
                inChar = octStr.charAt(i); 
                int digitValue = inChar - '0'; 
                decimal = decimal * 8 + digitValue; 
            } 
            System.out.println("The equivalent decimal number for octal \""  + octStr + "\" is: " + decimal); 
        } 
        in.close(); 
    } 
}