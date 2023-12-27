
package queueexample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ladzani_fabian
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> numbersQueue = new LinkedList<>();
        
        if(numbersQueue.isEmpty()){
            System.out.println("The queue is empty");
        }
        
        numbersQueue.add(1);
        numbersQueue.add(2);
        numbersQueue.add(3);
        numbersQueue.add(4);
        numbersQueue.add(5);
        
        System.out.println("""
                           The elements have been added.
                           The size of the queue is """+numbersQueue.size());
        for(Integer number: numbersQueue){
            System.out.println( number +" is the queue");
        }
        
        // get the first element is the queue using the element() method
        // --> doesn't remove the element!
        System.out.println("\nThe first element is "+numbersQueue.element());
        System.out.println("The size of the queue is "+ numbersQueue.size());
        
        for(Integer number: numbersQueue){
            System.out.println(number +" is in the queue");
        }
        
        // get the first element in the queue using the peek() method
        // --> doesn't remove the element in the queue!
        System.out.println("\nThe first element is "+ numbersQueue.peek());
        System.out.println("The size of the queue is "+ numbersQueue.size());
        
        for(Integer number : numbersQueue){
            System.out.println(number+ " is in the queue!");
        }
        
        System.out.println("\nThe first element is "+ numbersQueue.poll());
        System.out.println("The size of the queue is "+ numbersQueue.size());
        
        for(Integer number: numbersQueue){
            System.out.println(number + " is in the queue.");
        }
        //add an element to the queue.
        numbersQueue.offer(9);
        numbersQueue.add(10);
        
        System.out.println("\n9 and 10 have been added to the queue.");
        System.out.println("\nThe first element is "+ numbersQueue.peek());
        System.out.println("The size of the queue is "+ numbersQueue.size());
        
        for(Integer number: numbersQueue){
            System.out.println(number+" is in the queue.");
        }
        
        //remove the first element from the queue
        numbersQueue.remove();
        
        System.out.println("\nThe first element is "+ numbersQueue.peek());
        System.out.println("The size of the queue is "+ numbersQueue.size());
        
        for(Integer number: numbersQueue){
            System.out.println(number + " is in the queue");
        }
        
        if(numbersQueue.contains(6)){
            System.out.println(6 + " is found in the queue");
        }else {
            System.out.println(6+" is not in the queue");
        }
        
        numbersQueue.clear();
        
        if(numbersQueue.isEmpty()) {
            System.out.println("The queue is empty");
        }else {
            System.out.println("The queue has elements");
        }   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
