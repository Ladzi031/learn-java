
package ac.za.tut.entity;

/**
 * @author Ladzani_fabian
 */
public class BankAccount {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount += amount;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" + "amount=" + amount + '}';
    }
    
}
