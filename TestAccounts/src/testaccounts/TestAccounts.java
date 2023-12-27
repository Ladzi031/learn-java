package testaccounts;

import oop.inheritance.exercise2.bankaccount.BankAccount;
import oop.inheritance.exercise2.clothingaccount.ClothingAccount;

/**
 * @author Ladzani_fabian
 */
public class TestAccounts {
    public static void main(String[] args) {
        // test accounts;
        ClothingAccount clothing = new ClothingAccount(500, 400, 1000, 654321, "Mr Fabian");
        BankAccount bankAccount = new BankAccount(13000, 123456, "Ladzani Bengane");
        System.out.println(bankAccount.getAccountHolder() + " this is how much you have R"+bankAccount.getBalance()+" in the bank-account: "+bankAccount.getAccountNumber());
        boolean canClientAfford = clothing.buy(800);
        System.out.println("can client afford to buy: "+ canClientAfford);
        double mustPay = clothing.minimumPayment();
        System.out.println("the client must at least pay: R"+ mustPay +" per month in order to pay back debt!");
        //deposit 
       double oldBalance =  bankAccount.getBalance();
        System.out.println("client has R"+ oldBalance + " in the bank-account");
        bankAccount.deposit(3000);
        double newBalance = bankAccount.getBalance();
        System.out.println("the client has a new balance of R"+ newBalance+ " in the bank-account");
    }
}
