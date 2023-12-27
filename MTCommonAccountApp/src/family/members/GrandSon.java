
package family.members;

import ac.za.tut.bl.BankAccountManager;
import ac.za.tut.bl.InsufficientBalanceException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ladzani_fabian
 */
public class GrandSon extends Thread {
    
    private BankAccountManager manageAccount;
    private final Double withdrawAmount = 100.0;
    
    
    public GrandSon(BankAccountManager manageAccount) {
        this.manageAccount = manageAccount;
    }
    
    
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            withdraw(withdrawAmount);
        }
    }

    private synchronized void withdraw(Double withdrawAmount) {
        try {
            Double amount =  manageAccount.withdraw(withdrawAmount);
            System.out.println("Grandson withdrew amount : "+ amount + "\n");
        } catch (InsufficientBalanceException ex) {
            ex.getMessage();
            System.out.println("GrandSon, not enough money to make the withdrawal\n\n");
        }
    }
}
