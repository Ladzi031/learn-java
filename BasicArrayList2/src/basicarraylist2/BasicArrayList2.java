package basicarraylist2;

import java.util.ArrayList;

/*
 * @author Ladzani_fabian
 */
public class BasicArrayList2 {
    
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        
        String[] telePhone = {"073 356 2424","065 976 1066", "073 276 4567", "083 456 8944", "083 345 3453"};
        for(String holdStr: telePhone){
            phoneNumbers.add(holdStr);
        }
        
        System.out.println(phoneNumbers);
        phoneNumbers.add(2, "083 654 7923");
         
        String removeNumber = phoneNumbers.remove(1);
        System.out.println("We removed the number: "+ removeNumber);
        
        System.out.println("displaying all numbers that start with 083");
        for(String number: phoneNumbers){
            if(number.startsWith("083")){
                System.out.println(number);
            }
        }
        System.out.println("done!");
        
    }
}
