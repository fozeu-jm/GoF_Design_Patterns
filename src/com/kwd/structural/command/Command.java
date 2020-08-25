package com.kwd.structural.command;

import com.kwd.structural.command.BankAccountCommand.Action;

public interface Command {
	public void execute(Action action, int amount);
}
