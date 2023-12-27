
package listexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
public class ListExample {
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> numbers = new ArrayList<>();
        if(numbers.isEmpty()){
            System.out.println("The list is empty");
        }
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        numbers.forEach(System.out::println);
        
        int removeElement = numbers.remove(4);
        System.out.println("The element "+ removeElement + " has been removed");
        
        numbers.forEach(System.out::println);
        
        int element = numbers.get(0);
        System.out.println("The element at index 0 is: "+ element);
        numbers.forEach(System.out::println);
        
        System.out.println("Element at index 0 is now changed to 20");
        numbers.add(0, 20);
        numbers.forEach(System.out::println);
        
        
        System.out.println("Element at index 0 replaced with 20");
        numbers.set(0, 20);
        numbers.forEach(System.out::println);
        
        
        if(numbers.contains(20)){
            System.out.println(20 + " is present in the list, it occurs at index "+ numbers.indexOf(20));
        }else {
            System.out.println(20 + " is not the list");
            
        }
        
        numbers.clear();
        
        if(numbers.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }
    }
    
}
