
public class Account {

	private int balance = 10000;
	
	public void deposit(int amount) {
		
	}
	
	public void withdraw(int amount) {
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}
