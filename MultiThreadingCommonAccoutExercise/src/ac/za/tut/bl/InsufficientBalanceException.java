
package ac.za.tut.bl;

/**
 *
 * @author Ladzani_fabian
 */
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
    
}
