package customExceptions;

public class NotNameOrSurnameException extends Exception{
    
    public NotNameOrSurnameException () {
        
    }
    
    public NotNameOrSurnameException (String message) {
        super(message);
    }
}
