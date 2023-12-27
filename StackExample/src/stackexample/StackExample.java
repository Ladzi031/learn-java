
package stackexample;
import  java.util.Stack;

/**
 * @author Ladzani_fabian
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        int topNum;
        int poppedTopNum;
        int index;
        
        Stack<Integer> numbers = new Stack<>();
        
        if(numbers.isEmpty()){
            System.out.println("The stack is empty. Add elements to the stack.");
        }
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println("The following elements have been added to the stack: "+ numbers);
        
        for(Integer num: numbers){
            System.out.println(num + " is a index "+ numbers.indexOf(num)+ " of the stack.");
        }
        
        size = numbers.size();
        topNum = numbers.peek();
        
        System.out.println("\nThe number at the top of the stack is "+ topNum);
        System.out.println("The size of the stack is "+ size);
        
        for(Integer num: numbers){
            
            System.out.println(num + " is at index "+ numbers.indexOf(num)+ " of the stack.");
        }
        poppedTopNum = numbers.pop();
        System.out.println("\nThe popped numbers from the top of the stack is "+ poppedTopNum);
        System.out.println("The size of the stack is "+ numbers.size());
        
        
        for(Integer num: numbers){
            System.out.println(num + " is at index "+ numbers.indexOf(num)+ " of the stack.");
        }
        
        numbers.push(9);
        numbers.push(10);
        
        System.out.println("\n9 and 10 have been added to the stack.");
        
        for(Integer num: numbers){
            System.out.println(num + " is at index "+ numbers.indexOf(num)+ " of the stack.");
            
        }
        topNum = numbers.peek();
        System.out.println("\nThe number at the top of the stack is "+ topNum);
        System.out.println("The size of the stack is "+ numbers.size());
        
        index = numbers.search(10);
        
        if(index != -1){
            System.out.println("\n " + 10 + " has been found at index "+ index);
        }else {
            System.out.println("\n"+ 10 + " was not found at the stack.");
        }
        
        boolean isRemoved = numbers.removeElement(10);
        if(isRemoved){
            System.out.println("\n "+ 10 + " has been removed.");
        }else {
            System.out.println("\n "+ 10 + " was not removed.");
        }
        System.out.println("\nThe first element is "+numbers.firstElement());
        
        System.out.println("\nThe last element is "+ numbers.lastElement());
        
        numbers.clear();
        
        if(numbers.isEmpty()){
            System.out.println("\nThe stack is empty.");
        }else {
            System.out.println("\nThe stack is not empty. there are "+ numbers.size()+ " elelments in the stack.");
        }
    }
    
}
