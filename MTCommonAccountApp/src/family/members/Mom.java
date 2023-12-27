
package family.members;

import ac.za.tut.bl.BankAccountManager;
import ac.za.tut.bl.InsufficientBalanceException;

/**
 * @author Ladzani_fabian
 */
public class Mom extends Thread {
   
    private BankAccountManager manageAccout;
    private final Double I_WANT_AMOUNT = 200.0;
    
    public Mom(BankAccountManager manageAccount){
        this.manageAccout = manageAccount;
    }
    
    @Override
   public void run(){
       for(int i = 0; i < 10; i++){
           withdraw(I_WANT_AMOUNT); 
       }
   }
   
   private  synchronized void withdraw(Double amount) {
         
       try {
          Double withdrawAmount = this.manageAccout.withdraw(amount);
            System.out.println("Mom withdrew amount: "+ withdrawAmount + "\n\n");
            
        } catch (InsufficientBalanceException ex) {
            ex.getMessage();
            System.out.println("Mom, not enough money to make the withdrawal\n\n");
        }
       
   }
}
