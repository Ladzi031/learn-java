package testvehicles;

import oop.inheritance.exercise1.car.Car;
import oop.inheritance.exercise1.truck.Truck;

/**
 * @author Ladzani_fabian
 */
public class TestVehicles {
    public static void main(String[] args) {
        Car car = new Car(4, 1500, 4);
        Truck truck = new Truck(5, 4500, 16, 20000);
        
        // car objects
        double carWeight = car.getWeight();
        System.out.println("the weight of the car is: "+ carWeight);
        
        //truck objects...
        double truckWeight = truck.getWeight();
        System.out.println("the weight of the truck is: "+truckWeight);
        
        String truckString = truck.toString();
        System.out.println("truck string details: "+ truckString);
        
        String carString = car.toString();
        System.out.println("car string details: "+ carString);
    }
    
}
