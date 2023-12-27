
package family.members;

import ac.za.tut.bl.BankAccountManager;

/**
 * @author Ladzani_fabian
 */
public class Son extends Thread {
    
    private BankAccountManager manageAccount;

    public Son(BankAccountManager manageAccount) {
        this.manageAccount = manageAccount;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            getAccountBalance();
        }
        
    }

    private synchronized void getAccountBalance() {
        Double amount = manageAccount.getBalance();
        System.out.println("Son, "+ amount + " is in the bank acount");
    }
}
