package oop.inheritance.exercise2.bankaccount;

import inheritance.exercise2.account.Account;
/**
 * @author Ladzani_fabian
 */
public class BankAccount extends Account{
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
       //assuming that the argument is valid
       this.balance += amount;
   }
   public void withdraw(double amount){
       //assuming the argument is valid
       this.balance -= amount;
   }
   
}
