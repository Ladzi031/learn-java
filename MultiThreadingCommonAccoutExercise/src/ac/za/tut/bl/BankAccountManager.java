
package ac.za.tut.bl;

import ac.za.tut.entity.BankAccount;

/**
 * @author Ladzani_fabian
 */
public class BankAccountManager implements bankAccountInterface {
    
    private final BankAccount bankAccount;

    public BankAccountManager() {
        this.bankAccount = new BankAccount();
    }
    
    @Override
    public Double getBalance() {
       return this.bankAccount.getAmount();
    }

    @Override
    public void deposit(Double amount) {
        this.bankAccount.setAmount(amount);
        System.out.println("========succesfully deposited the funds=============");
    }

    @Override
    public Double withdraw(Double amount) throws InsufficientBalanceException {
        Double amountInTheAcount = this.bankAccount.getAmount();
        if(amountInTheAcount < amount){
            throw new InsufficientBalanceException(" you have insufficient Funds to make a successfull withdrawal");
        }
        
        Double amountLeft = amountInTheAcount - amount;
        this.bankAccount.setAmount(amountLeft);
        System.out.println("=====withdrawal successful=========");
        return amount;
    }
    
}
