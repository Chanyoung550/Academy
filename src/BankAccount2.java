package ch07;

class BankAccount2 {

	String accNumber;
	String ssNumber;
	int balance;
	
	public BankAccount2(String acc, String ss, int bal) {
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
		System.out.println("°èÁÂ¹øÈ£ : "+accNumber);
		System.out.println("ÁÖ¹Î¹øÈ£ : "+ssNumber);
		System.out.println("ÀÜ ¾× : "+balance+'\n');
		return balance;
	}

}