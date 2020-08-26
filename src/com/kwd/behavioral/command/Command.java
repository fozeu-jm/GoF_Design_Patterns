package com.kwd.behavioral.command;

import com.kwd.behavioral.command.BankAccountCommand.Action;

public interface Command {
	public void execute(Action action, int amount);
}
