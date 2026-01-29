import java.util.Scanner;
public class SalesTaxCalculator 
{
    public static void main(String[] args) 
	{   
        final double SALES_TAX_RATE = 0.07;  
        final int SENTINEL = -1;             
        double price, actualPrice, salesTax;  
        double totalPrice = 0.0;
        double totalActualPrice = 0.0;
        double totalSalesTax = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = sc.nextDouble();
        while (price != SENTINEL) 
		{
            actualPrice = price / (1 + SALES_TAX_RATE);
            salesTax = price - actualPrice;
            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
            System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n%n",actualPrice, salesTax);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = sc.nextDouble();
        }
        System.out.printf("Total Price is: $%.2f%n", totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n", totalActualPrice);
        System.out.printf("Total Sales Tax is: $%.2f%n", totalSalesTax);
    }
}