package ch07;

public class BankAccount1 {

	String accNumber;
	String ssNumber;
	int balance=0;
	
	public void initAccount(String acc, String ss, int bal) {
		accNumber=acc;
		ssNumber=ss;
		balance=bal;
	}
	public int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("���¹�ȣ : "+accNumber);
		System.out.println("�ֹι�ȣ : "+ssNumber);
		System.out.println("�� �� : "+balance+'\n');
		return balance;
	}

}

