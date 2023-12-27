package bengane.lf;

import java.io.*;

public class Car implements Serializable{
    private CarKey key; // car "has a" key
    private String interiorColour;
    private String exteriorColor;
    private final String CAR_MODEL_NAME = "Lamborghini Sián FKP 37";

    public Car(String ownerName, String interiorColour, String exteriorColor) {
        this.interiorColour = interiorColour;
        this.exteriorColor = exteriorColor;
        key = new CarKey(ownerName);
    }
    
    public String getCarDetailsAndSpecs(){
        return null;
     }

    public CarKey getKey() {
        return key;
    }

    public void setKey(CarKey key) {
        this.key = key;
    }

    public String getInteriorColour() {
        return interiorColour;
    }

    public void setInteriorColour(String interiorColour) {
        this.interiorColour = interiorColour;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }
    
}
