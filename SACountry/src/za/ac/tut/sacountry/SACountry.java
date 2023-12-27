package za.ac.tut.sacountry;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.city.City;
/**
 * @author Ladzani_fabian
 */
public class SACountry {
    public static void main(String[] args) {
        // below is mimicking a database, i think...
        String[] citiesInfo = {
            "Kimberley#Northern Cape#175860",
            "Chatsworth#KwaZulu-Natal#192166",
            "Katlehong#Gauteng#349866",
            "Port Elizabeth#Eastern Cape#237500",
            "Khayelitsha#Western Cape#329002",
            "Pretoria#Gauteng#525387",
            "Bloemfontein#Free State#217076",
            "Tshivhase#Limpopo#226622",
            "Soweto#Gauteng#858644",
            "Pietermaritzburg#KwaZulu-Natal#223519",
            "Burban#KwaZulu-Natal#536644",
            "Nelspruit#Mpumalanga#359600",
            "Johannesburg#Gauteng#1009035",
            "Mamelodi#Gauteng#256117"
        };
        int numberOfCities = citiesInfo.length;
        ArrayList<City> cities = new ArrayList<>(numberOfCities);
        
        for(int i = 0; i < numberOfCities; i++){
             //separate values
            int firstHash = citiesInfo[i].indexOf("#");
            int lastHash = citiesInfo[i].lastIndexOf("#");
            String city = citiesInfo[i].substring(0, firstHash);
            String province = citiesInfo[i].substring(firstHash+1, lastHash);
            String populationString  = citiesInfo[i].substring(lastHash+1);
            int population = Integer.parseInt(populationString);
            
            //creating object with fields/attributes having the above values
            City cityObject =  new City(city);
            cityObject.setPopulation(population);
            cityObject.setProvince(province);
            
            //add to arrayList
            cities.add(cityObject);  
        }
        // display city with the highest population
        String cityWithHighestPopulation = highestPopulation(cities);
        JOptionPane.showMessageDialog(null, "the city with the highest Population is: "+ cityWithHighestPopulation, "highest population per country", JOptionPane.INFORMATION_MESSAGE);
        
        //display number of cities per province
        final String PROVINCE_STRING = "Gauteng";
        int numberOfCitiesPerProvince = citiesPerProvince(cities, PROVINCE_STRING);
        JOptionPane.showMessageDialog(null, "the number of cities in the province of: "+PROVINCE_STRING+ " is "+numberOfCitiesPerProvince,"number of cities per province", JOptionPane.INFORMATION_MESSAGE);
        
        //update the population for cities...
        final double PERCENTAGE_INCREASE = 0.0236;
        updatePopulation(cities, PERCENTAGE_INCREASE);
    }
    public static String highestPopulation(ArrayList<City> city){
        String cityString = "";
        int largestPopulation = 0;
        int[] cityIntArray = new int[city.size()];
        for(int i= 0; i < city.size(); i++){
           int populationValue = city.get(i).getPopulation();
           cityIntArray[i] = populationValue;
        }
        for(int i = 0; i < city.size(); i++){
            if(largestPopulation < cityIntArray[i]){
                largestPopulation = cityIntArray[i];
            }
        }
        for(City c: city){
            if(largestPopulation == c.getPopulation()){
                cityString = c.getName();
                break;
            }
        }
        return cityString;
    }
    public static int citiesPerProvince(ArrayList<City> city, String provinceName){
        int numberOfCititesPerProvince = 0;
        for(City c: city){
            if(provinceName.equalsIgnoreCase(c.getProvince())){
                numberOfCititesPerProvince += 1;
            }
        }
        return numberOfCititesPerProvince;
    }
    public static void updatePopulation(ArrayList<City> city , double PERCENTAGE_INCREASE){
        String displayPopulation = "";
        for(City c: city){
           int updatedPopulation = (int)((c.getPopulation() * PERCENTAGE_INCREASE) + c.getPopulation());
           c.setPopulation(updatedPopulation);
           displayPopulation += c.getName() + " with a population number of "+ c.getPopulation()+ " people\n";
        }
        System.out.println(displayPopulation);
    }
}