package testing.product;

import java.io.Serializable;
/**
 * @author Ladzani_fabian
 */
public class LimitedEditionLamborghiniCar implements Serializable{
    private Key carKeys; 
    private String clientFirstName; // text input
    private String clientLastName; // text input
    private String interiorColour; //select Option 
    private String exteriorColour; // select Option
    private final String lamborghiniLimitedEditionModelName = "Lamborghini Sián FKP 37";
    
    //GiveClientKeys method...(maybe part of the helper method)
    public String getLamborghiniLimitedEditionModelName(){
        return lamborghiniLimitedEditionModelName;
    }

    //DisplaycarDetails
    public String getCarDetails() {
        String carDetails = "Model-Name: "+this.getLamborghiniLimitedEditionModelName()+"\nPower: 602 KW\n"
                + "MAX. SPEED: 355 KM-H\n0-100KM-H: <2.8sec";
        return carDetails;
    }
}
