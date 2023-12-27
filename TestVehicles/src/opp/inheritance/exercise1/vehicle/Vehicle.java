package opp.inheritance.exercise1.vehicle;
/**
 * @author Ladzani_fabian
 */
public class Vehicle {
    private int wheels;
    private double weight;
    
    //default constructor...
    public Vehicle(){
    }
    public Vehicle(int wheels, double weight){
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }
    public String toString(){
        
        return "Number of wheels: "+getWheels()+"\nWeight of the vehicle: "+ getWeight()+"kg";
    }
    
}
