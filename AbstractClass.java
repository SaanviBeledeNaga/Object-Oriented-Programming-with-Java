abstract class BankAccount
{
	double balance;
	//constructor 
	BankAccount(double balance)
	{
		this.balance = balance;
		System.out.println("Bank Account created with initial balance" + balance);
	}
	//abstract method
	abstract  void calculateInterest();
	//static method
	static void show()
	{
		System.out.println("This is static method inside abstract class");
	}
	/*//default method (cannot be used in abstract class)
	default void show()
	{
		System.out.println("This is default method inside the abstract class");
	}*/
	//non-abstract method or concrete method
	void displayBalance()
	{
		System.out.println("Current Balance: " + balance);
	}
}
//subclass implementing the abstract method 
class SavingsAccount extends BankAccount
{
	SavingsAccount(double balance)
	{
		super(balance); //calling abstract class constructor 
	}
	@Override 
	void calculateInterest()
	{
		double interest = balance*0.04; 
		System.out.println("Interest earned on savings account: "+interest);
	}
}
//main class 
public class AbstractClass
{
	public static void main(String[] args)
	{
		BankAccount account = new SavingsAccount(5000.0);
		account.displayBalance();
		account.calculateInterest();
		BankAccount.show(); //call static method with abstract class only 
	}
}

	
		