
package mapexample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ladzani_fabian
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<Integer, String> map = new HashMap<>();
        
        if(map.isEmpty()){
            System.out.println("The map is empty");
            
        }
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        
        
        // display the contents of the map
        System.out.println("The size of the map is "+ map.size());
        
        //get a map entry and display it's key and value
        for(Map.Entry data: map.entrySet()){
            System.out.println(data.getKey() + " ---> "+ data.getValue());
        }
        
        map.put(9, "Nine");
        map.put(10, "Ten");
        
        System.out.println("\nThe size of the map is "+ map.size());
        
        for(Map.Entry data: map.entrySet()){
            System.out.println(data.getKey() + " ---> "+ data.getValue());
        }
        
        String value = map.get(3);
        if(value == null){
            System.out.println("There's no such an entry.");
        }else {
            System.out.println(value + " has the key "+ 3 +".");
        }
        
        
        String outcome = map.remove(9);
        
        if(outcome == null) {
            System.out.println("The element was not removed.");
        }else {
            System.out.println("\n "+ outcome +" was successfully removed");
        }
        
        for(Map.Entry data: map.entrySet()){
            System.out.println(data.getKey() +" ---> "+ data.getValue());
        }
        map.put(10, "TEN");
        
        
        for(Map.Entry data: map.entrySet()){
            System.out.println(data.getKey()+ " ---> "+ data.getValue());
        }
        
        
    }
    
}
