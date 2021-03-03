package ch07;

public class PassingRef {

	public static void main(String[] args) {
		BankAccount ref= new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);

	}
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}

}
