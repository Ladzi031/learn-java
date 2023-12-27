package entity;

import java.util.Random;

/*
 * @author Ladzani_fabian
 */
public class Employee {
    private final Integer staffNumber;
    private int temperature;

    public Employee(int temperature) {
        this.staffNumber = new Random().nextInt(100) + 1;
        this.temperature = temperature;
    }

    public Employee() {
        this.staffNumber = new Random().nextInt(100) + 1;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Integer getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "staffNumber=" + staffNumber + ", temperature=" + temperature + '}';
    }
    
    
}
