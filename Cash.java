import java.util.Scanner;
public class Cash 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of item in dollars: ");
        int s = sc.nextInt();
        System.out.print("Enter amount given in dollars: ");
        int a = sc.nextInt();
        int c = (a - s) * 100;
        System.out.println("Change (in cents): " + c);
        int c25 = c / 25; 
		c %= 25;
        int c10 = c / 10; 
		c %= 10;
        int c5  = c / 5; 
		c %= 5;
        int c1  = c;
        System.out.println("25 cent coins: " + c25);
        System.out.println("10 cent coins: " + c10);
        System.out.println("5 cent coins : " + c5);
        System.out.println("1 cent coins : " + c1);
    }
}
