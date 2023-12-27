package oop.inheritance.exercise2.bankAcount;

import inheritance.exercise2.account.Account;

public class BankAccount extends  Account{
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance, int i, String string) {
        super(i, string);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        // some checking if we have more than the amount that we want to withdraw
        this.balance -= amount;
    }
}
