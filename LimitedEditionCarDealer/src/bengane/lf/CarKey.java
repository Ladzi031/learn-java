package bengane.lf;
import java.io.*;
import java.util.Random;

public final class CarKey  implements Serializable{
    private String keyIdentification;
    private final String ownerName;

    public CarKey(String ownerName) {
        // simple car-key programming...
        this.ownerName = reverseString(ownerName);
        this.keyIdentification = generateKey(this.ownerName);
    }
    private String reverseString(String name){
        String[] arr = name.split("");
        String newString = "";
        for(int i = arr.length - 1; i >= 0 ; i--){
           newString += arr[i];
        }
        return newString;
    }
    private String generateKey(String reversedName){
        Random random = new Random();
        int randomNumber = random.nextInt(10, 9999) + 1;
        String newString = reversedName + randomNumber;
        return newString;
    }

    public String getKeyIdentification() {
        char firstLetter = Character.toUpperCase(this.keyIdentification.charAt(0));
        this.keyIdentification = firstLetter + (this.keyIdentification.substring(1).toLowerCase());
        return keyIdentification;
    }
    
    
}
