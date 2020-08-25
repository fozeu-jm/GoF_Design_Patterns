package com.kwd.structural.command;

public class BankAccountCommand implements Command {
	private BankAccount acc;
	public enum Action{
		DEPOSIT, 
		WITHDRAW
	}
	
	public BankAccountCommand(BankAccount p_acc) {
		this.acc = p_acc;
	}
	
	@Override
	public void execute(Action action, int amount) {
		switch (action) {
		case DEPOSIT:
			acc.Deposit(amount);
			break;

		case WITHDRAW:
			acc.withdraw(amount);
			break;
		}
	}

}
