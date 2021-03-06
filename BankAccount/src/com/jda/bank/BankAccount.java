package com.jda.bank;
import java.util.Random;

public class BankAccount {
	private double checking;
	private double savings;
	private String accountNumber;
	private static int accounts = 0;
	private static double total = 0;
	
	public BankAccount() {
		accounts ++;
		this.setChecking(0);
		this.setSavings(0);
		this.setAccountNumber(this.makeNumber());
	}
	
	public BankAccount(int chk, int sav) {
		accounts ++;
		total += chk;
		total += sav;
		this.setChecking(chk);
		this.setSavings(sav);
		this.setAccountNumber(this.makeNumber());
	}

	Random r = new Random();
	
	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public void deposit(String acc, double amount) {
		if(acc=="checking") {
			this.setChecking(this.getChecking()+amount);
			total+=amount;
		}
		else if(acc=="saving") {
			this.setSavings(this.getSavings()+amount);
			total+=amount;
		}
	}
	
	public void withdraw(String acc, double amount) {
		if(acc == "checking") {
			if(this.getChecking()<amount) {
				System.out.println("Insufficient Funds");
			}
			else {
				this.setChecking(this.getChecking()-amount);
				System.out.println("Withdrew " + amount);
			}
		}
		else if(acc == "saving") {
			if(this.getSavings()<amount) {
				System.out.println("Insufficient Funds");
			}
			else {
				this.setSavings(this.getSavings()-amount);
				System.out.println("Withdrew " + amount);
			}
		}
	}
	
	private String makeNumber() {
		String num = "";
		for(int i=1; i<=10; i++) {
			num+=r.nextInt(10);
		}
		return num;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static void setAccounts(int accounts) {
		BankAccount.accounts = accounts;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		BankAccount.total = total;
	}

	public static void numberAccounts() {
		System.out.println(accounts);
	}
}
