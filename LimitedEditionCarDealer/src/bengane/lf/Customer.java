package bengane.lf;

import java.io.*;

public class Customer implements  Serializable{
    private Car car;  // customer "has a" key
    private String firstName;
    private int contactNumber;
    
    
    public Customer( String firstName, int contactNumber, String interiorColour, String exteriorColour) {
        this.firstName = firstName;
        this.contactNumber = contactNumber;
         // check if car is available... if yes, then car
        car = new Car(firstName, interiorColour, exteriorColour);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    
    
}
