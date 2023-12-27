
package family.members;

import ac.za.tut.bl.BankAccountManager;
import ac.za.tut.bl.InsufficientBalanceException;

/**
 * @author Ladzani_fabian
 */
public class Dad extends Thread {
    private final Double I_WANT_AMOUNT = 500.0;
    private BankAccountManager manageAccount;

    public Dad(BankAccountManager manageAccount) {
        this.manageAccount = manageAccount;
    }
    
    
    @Override
    public void run(){
       for(int i = 0; i < 10; i++){
           withdraw(I_WANT_AMOUNT);
       } 
    }

    private synchronized void withdraw(Double I_WANT_AMOUNT) {
        try {
            
           Double withdrawAmount = this.manageAccount.withdraw(I_WANT_AMOUNT);
            System.out.println("Dad withdrew amount: "+ withdrawAmount + "\n\n");
            
        } catch (InsufficientBalanceException e) {
            
            e.getMessage();
            System.out.println("Dad,not enough money to make the withdrawal\n");
        }
    }
    
}
