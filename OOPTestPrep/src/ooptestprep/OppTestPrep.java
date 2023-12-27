package ooptestprep;

import oop.test.Car;
import oop.test.Truck;
import oop.test.Vehicle;

public class OppTestPrep {
    public static void main(String[] args) {
      Vehicle vehicle = new Car();
      
      Vehicle vehicle1  = new Truck();
      
        System.out.println(checkTypeOfVehicle(vehicle));
        System.out.println(checkTypeOfVehicle(vehicle1));
    }
    public static String checkTypeOfVehicle(Vehicle v){
        String results = "";
        if (v instanceof Car){
           results = ((Car) v).specialCarMethod() + " plus "+((Car) v).getSomeInteraction();
        }else if(v instanceof Truck){
            results = ((Truck) v).specialTruckMethod();
        }
        return results;
    }    
}