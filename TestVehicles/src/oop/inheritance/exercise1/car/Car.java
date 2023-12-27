package oop.inheritance.exercise1.car;

import oop.inheritance.exercise1.vehicle.Vehicle;

public class Car extends Vehicle{
    private int passengerLoad;

    public Car() {
    }

    public Car(int passengerLoad, int wheels, double weight) {
        super(wheels, weight);
        this.passengerLoad = passengerLoad;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }
    
}
