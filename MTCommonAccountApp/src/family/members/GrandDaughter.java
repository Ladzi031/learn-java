
package family.members;

import ac.za.tut.bl.BankAccountManager;

/**
 * @author Ladzani_fabian
 */
public class GrandDaughter extends Thread {
    
    private final BankAccountManager manageAccount;
    private final Double DEPOSIT = 400.0;

    public GrandDaughter(BankAccountManager manageAccount) {
        this.manageAccount = manageAccount;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            depositFunds(DEPOSIT);
        }
    }

    private synchronized void depositFunds(Double amount) {
        manageAccount.deposit(amount);
        System.out.println("GrandDaughter, deposited amount: "+ amount+ "\n");
    }
}
