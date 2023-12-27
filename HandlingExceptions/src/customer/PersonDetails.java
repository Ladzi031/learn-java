package customer;

import customExceptions.InvalidIDException;

public class PersonDetails {
    
    private String name;
    private String surname;
    private String ID;

    public PersonDetails(){
    }
    public PersonDetails(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }
    
    public void setDetails (String name, String surname, String ID) throws InvalidIDException {
        final int EIGHT_CHARACTERS_LONG = 8;
        this.name = name;
        this.surname = surname;
        if(ID.length() != EIGHT_CHARACTERS_LONG) {
             throw new InvalidIDException("ID number must be 8 digits long");
        }else {
            this.ID = ID;
        }
    }
    
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }
}
