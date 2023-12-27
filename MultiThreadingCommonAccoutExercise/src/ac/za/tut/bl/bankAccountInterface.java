
package ac.za.tut.bl;

/**
 * @author Ladzani_fabian
 */
public interface bankAccountInterface {
    public Double getBalance();
    public void deposit(Double amount);
    public Double withdraw(Double amount) throws InsufficientBalanceException;
}
