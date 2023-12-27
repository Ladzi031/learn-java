package za.ac.tut.superfastdeliveries;

/**
 * **************************
 * @author Ladzani_fabian * *
 ***************************
 */
import java.util.ArrayList;
import za.ac.tut.delivery.Delivery;
import java.util.Random;

public class SuperFastDeliveries {

    private static Delivery delivery;

    public static void main(String[] args) {
        Random random = new Random();

        String[] deliveryInfo = {
            "2019:1:12.34",
            "2020:1:34.44",
            "2020:1:35.19",
            "2020:2:9.47",
            "2019:2:7.37",
            "2020:1:62.44",
            "2020:2:145.12",
            "2019:2:25.93",
            "2019:1:56.83",
            "2020:1:81.29",
            "2019:2:42.33",
            "2019:2:22.98",
            "2020:1:35.23",
            "2019:1:44.44",
            "2019:2:108.54",
            "2020:2:92.11",
            "2019:2:21.21",
            "2020:1:101.23",
            "2020:1:3.55",
            "2019:1:64.22",
            "2019:2:76.36",
            "2020:2:64.39",
            "2019:1:17.04",
            "2020:1:7.59"
        };
        int initialCapacity = deliveryInfo.length;
        ArrayList<Delivery> listOfDeliveries = new ArrayList<>(initialCapacity);
        for (int i = 0; i < deliveryInfo.length; i++) {

            String tempDeliveryInfo = deliveryInfo[i];
            String[] deliver = tempDeliveryInfo.split(":");
            int year = Integer.parseInt(deliver[0]);
            int code = Integer.parseInt(deliver[1]);
            double weight = Double.valueOf(deliver[2]);
            int deliveryNumber = random.nextInt(1, 10000);

            delivery = new Delivery(year, deliveryNumber, code, weight);
            listOfDeliveries.add(delivery);
        }
        String lightestWeight = lightest(listOfDeliveries);

        System.out.println("the results of the lightest weight is: " + lightestWeight);
        
        int forYear = 2023;
        double results2 = averageFee(listOfDeliveries, forYear );
        System.out.println("the results for the average-fee for the year "+ forYear + " is "+ results2);
        
    }

    public static String lightest(ArrayList<Delivery> delivery) {
        double weight = delivery.get(0).getWeight();
        for (Delivery d : delivery) {
            if (weight < d.getWeight()) {
                weight = weight;
            } else {
                weight = d.getWeight();
            }
        }
        return String.valueOf(weight);
    }

    public static double averageFee(ArrayList<Delivery> delivery, int year) {
        int numberOfYears = 0;
        double deliveryFee = 0;
        
        for(int i = 0; i < delivery.size(); i++ ){
            int fourthCharacter = 4;
            String yearString = delivery.get(i).getDeliveryNumber().substring(0, fourthCharacter);
            int yearInteger = Integer.parseInt(yearString);
            
            if(year == yearInteger){
                numberOfYears += 1;
                deliveryFee += delivery.get(i).getFee();
                System.out.println("object IS part of the year selected!");
            }else{
                System.out.println("the YEAR not found!! " + "\nSystem.exiting...");
                System.exit(0);
            }
            
        }
         double yearlyAverage = deliveryFee / numberOfYears;
       
     return yearlyAverage;  
    }
}
