
package setexample;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ladzani_fabian
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set<Integer> set = new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        
        System.out.println("There are "+ set.size()+ " elements in the set.");
        System.out.println(set);
        
        boolean outcome = set.add(5);
        System.out.println("\nIs the duplicated added? :"+outcome);
        System.out.println(set);
        
        set.add(9);
        set.add(10);
        
        System.out.println("\nThere are "+ set.size()+ " elements in the set.");
        System.out.println(set);
        
        set.remove(10);
        System.out.println("\nThere are "+set.size()+ " elements in the set.");
        System.out.println(10+" has been removed.");
        System.out.println(set);
        
        if(set.contains(6)){
            System.out.println("\n"+6+" is the part of the set.");
        }else {
            System.out.println("\n"+6+" is not part of the set.");
        }
       
    }
    
}
