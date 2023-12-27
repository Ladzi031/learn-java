
package mtcommonaccountapp;

import ac.za.tut.bl.BankAccountManager;
import family.members.Dad;
import family.members.Daughter;
import family.members.GrandDaughter;
import family.members.GrandSon;
import family.members.Mom;
import family.members.Son;

/**
 * @author Ladzani_fabian
 */
public class MTCommonAccountApp {
    
    // a simulation of multiple threads interacting with a COMMON resource(Bank account)
    
    public static void main(String[] args) {
        final Double Inital_BALANCE = 1650.0;
        
        BankAccountManager manageBankAccount = new BankAccountManager();
        manageBankAccount.deposit(Inital_BALANCE);
        System.out.println("Initial amount of: "+ Inital_BALANCE+ "\n\n");
        
        Thread momThread = new Mom(manageBankAccount);
        momThread.start();
        
        Thread dadThread = new Dad(manageBankAccount);
        dadThread.start();
        
        Thread sonThread = new Son(manageBankAccount);
        sonThread.start();
        
        Thread daughterThread = new Daughter(manageBankAccount);
        daughterThread.start();
        
        Thread grandsonThread = new GrandSon(manageBankAccount);
        grandsonThread.start();
        
        Thread grandDaughterThread = new GrandDaughter(manageBankAccount);
        grandDaughterThread.start();
    }
    
}
