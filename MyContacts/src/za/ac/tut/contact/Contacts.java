package za.ac.tut.contact;
/**
 * @author Ladzani_fabian
 */
public class Contacts {
    private String name;
    private String phoneNumber;
    private char type;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = 'P';
    }

    public Contacts(String name, String phoneNumber, char type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public char getType() {
        return type;
    }
    
}
