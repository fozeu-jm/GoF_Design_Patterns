package com.kwd.structural.command;

public class BankAccount {
	private int balance;
	private int overdraft = -1000;

	public void Deposit(int amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ", balance is now " + balance);
	}

	public void withdraw(int amount) {
		if ((balance - amount) >= overdraft) {
			balance -= amount;
			System.out.println("Withdrew " + amount + ", balance is now " + balance);
		}else {
			System.out.println("You can't withdraw such an amount, contact your account manager");
		}
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}
