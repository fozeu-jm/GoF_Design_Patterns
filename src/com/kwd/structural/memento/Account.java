package com.kwd.structural.memento;

public class Account {
    int balance;

    public Account() {
    }

    public Memento deposit(int amount) {
        this.balance += amount;
        return new Memento(amount);
    }

    public void restore(Memento mem){
        balance = mem.getAmount();
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
