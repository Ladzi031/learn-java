package oop.inheritance.exercise1.truck;

import opp.inheritance.exercise1.vehicle.Vehicle;

/**
 * @author Ladzani_fabian
 */
public class Truck extends Vehicle{
    public int passengerLoad;
    public double payload;

    public Truck() {
    }

    public Truck(int passengerLoad, double payload) {
        this.passengerLoad = passengerLoad;
        this.payload = payload;
    }

    public Truck(int passengerLoad, double payload, int wheels, double weight) {
        super(wheels, weight);
        this.passengerLoad = passengerLoad;
        this.payload = payload;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }

    public double getPayload() {
        return payload;
    }
    public String toString(){
        return super.toString()+"\nNumber of Passengers: "+getPassengerLoad()+"\nPayload of the truck: "+getPayload();
    }
    
}
