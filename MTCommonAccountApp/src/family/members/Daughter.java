
package family.members;

import ac.za.tut.bl.BankAccountManager;

/**
 * @author Ladzani_fabian
 */
public class Daughter extends Thread {
     private BankAccountManager manageAccount;
     private final Double deposit = 100.0;

    public Daughter(BankAccountManager manageAccount) {
        this.manageAccount = manageAccount;
    }
     
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            depositFunds(deposit);
        }
    }

    private synchronized void depositFunds(Double deposit) {
        manageAccount.deposit(deposit);
        System.out.println("Daugher deposited amount: "+ deposit+ "\n");
    }
}
