package ch07;

public class BankAccountConstruct {

	public static void main(String[] args) {
		BankAccount2 yoon=new BankAccount2("12-34-89","990990-9090990",10000);
		BankAccount2 park=new BankAccount2("33-55-09","770088-5959007",10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();

	}

}
