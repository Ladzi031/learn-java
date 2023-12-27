package za.ac.tut.secondhanddealership;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.vehicle.Vehicle; 


/**
 * @author Ladzani_fabian
 */
public class SecondHandDealerShip {
    private final int CURRENT_YEAR = 2023;
     
    public static void main(String[] args) {
        
        
        //instance of the Vehicle class...
        Vehicle motor;
        
        
        
        String[] vehicleInfo = {
            "FG34QWGP#2015#17367.6#true",
            "SP45DHGP#2013#83431.8#true",
            "SDT291NC#2008#134984.3#false",
            "SPR917FS#2011#99346.3#false",
            "JW18XPGP#2012#104368.1#true",
            "CCP667NW#2013#78364.9#true",
            "AR22DDGP#2014#66714.5#true",
            "POD524NC#2013#49366.6#false",
            "LJ76EGGP#2013#104258.8#true"
        };
        //declare and arrayList of type Vehicle
        int initialCapacity = vehicleInfo.length;
        ArrayList<Vehicle> vehicle = new ArrayList<>(initialCapacity);
        
        for(int i = 0; i < vehicleInfo.length; i++){
            int firstHash = vehicleInfo[i].indexOf("#",9);
            int firstHash2 = vehicleInfo[i].indexOf("#");
           // int lastHash = vehicleInfo[i].lastIndexOf("#");
            
            String regAndYear = vehicleInfo[i].substring(0, firstHash);
            String registration = regAndYear.substring(0, firstHash2);
            String yearToInt = regAndYear.substring(9);
            int year = Integer.parseInt(yearToInt);
            String kilosAndServiceHistory = vehicleInfo[i].substring(firstHash+1);
            
            // resolving kiloMeters problem 
            String kiloToDouble = kilosAndServiceHistory.substring(0, firstHash2 - 1);
            double kilometers = Double.parseDouble(kiloToDouble);
            
            // resolving serviveHistory issue...
             String getServiceHistory = kilosAndServiceHistory.substring(firstHash2 + 1);
             boolean serviceHistory = Boolean.parseBoolean(getServiceHistory);
            
             //creating objects 
             motor = new Vehicle(registration, year, kilometers, serviceHistory);
             // add to ArrayList of type Vehicle
             vehicle.add(motor);
             
        }// end of for loop
        
        System.out.println("This list of Vehicle Registration numbers;");
        System.out.println("=================================================");
        String displayResults = registrationNumbers(vehicle);
        System.out.println(displayResults);
        
        //ask user which motor they want based on registrationNumber;
       String userInput = JOptionPane.showInputDialog(null,"which car do you want?");
       
        
       // assuming the user will not enter correct data (no input validation )
        String averageKiloMetersTraveled = averageKilometers(vehicle, userInput);
        JOptionPane.showMessageDialog(null, "the average kilometers traveled by the car is :"+ averageKiloMetersTraveled);
        // some calculation must occur her but i don't reallly understand... instructions too ambigous!!
        
       
       
    }
    public static String registrationNumbers(ArrayList<Vehicle> vehicle){
        String results = "";
        for(Vehicle v: vehicle){
           String tempResults =  v.getRegNumber();
           results += tempResults + "\n";
        }
        return results;
    }
    public static String averageKilometers(ArrayList<Vehicle> vehicle, String car){
        double kilometers = 0.0;
        for(Vehicle v: vehicle){
            if(v.getRegNumber().equals(car)){
               kilometers = v.getKilometers();
            }
        }
        String results = String.valueOf(kilometers)+ "km";
        return results;
    }
    
    
}
