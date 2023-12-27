package oop.inheritance.exercise1.car;

import opp.inheritance.exercise1.vehicle.Vehicle;

/**
 * @author Ladzani_fabian
 */
public class Car  extends Vehicle{
    private int  passengerLoad;
    
    //default constructor...
    public Car(){
    }
    public Car(int  passengerLoad, double weight, int wheels){
        super(wheels, weight);
        this.passengerLoad = passengerLoad;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }
    
    public String toString(){
        return super.toString()+"\nNumber of passengers: "+getPassengerLoad();
    }
    
    
}
