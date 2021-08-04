package com.jda.bank;

public class BankTest {

	public BankTest() {
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount(100,100);
		BankAccount c = new BankAccount(300,125);
		BankAccount d = new BankAccount();
		
		BankAccount.numberAccounts();
		System.out.println(BankAccount.getTotal());
		
//		d.deposit("checking", 300);

		System.out.println(BankAccount.getTotal());
		d.withdraw("checking", 150);
		
		System.out.println(d.getChecking());
		
		System.out.println(d.getAccountNumber());
	}

}
