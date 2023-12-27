package testing.product;

import java.io.Serializable;
import java.util.Random;
/**
 * @author Ladzani_fabian
 */
public class Key implements Serializable{
    private int keyId;

    public Key(){
        // generate new key_id
        // set to this.keyId;
        // pass name in the constructor for id-generation-key
    }

    public int getKeyId() {
        return keyId;
    }
     
    
}
