package basicarraylist;

import java.util.ArrayList;
// Waring trash code below...
public class BasicArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> listOfColours = new ArrayList<>();
        listOfColours.add("blue");
        listOfColours.add("green");
        listOfColours.add("Red");
        listOfColours.add("black");
        
        //System.out.println("first printing\n"+listOfColours);
        
        listOfColours.add(0,"white");
        System.out.println("first printing "+listOfColours);
        String remove = listOfColours.remove(1);
        System.out.println(remove);
        System.out.println("second printing "+listOfColours);
  
        boolean foundRed = false;
        for(int i = 0; i < listOfColours.size(); i++){
            String colour = listOfColours.get(i);
            if (colour.equalsIgnoreCase("red")) {
                System.out.println("the list contains the color RED");
                foundRed = true;
            }
        }
        String results = foundRed ? "the list contains the color red" : "the list does not contain the colour the RED";
        System.out.println(results);
        
        boolean hasRed= false;
        String searchFor = "red";
        for(String red: listOfColours){
            if(red.equalsIgnoreCase(searchFor)){
                hasRed = true;
                break;
            }
        }
        if (hasRed) {
            System.out.println("yes the list has the colour red");
        }else{
            System.out.println("nope the color does not exist in the list");
        }
        // the above code can be written in a better way!
    }  
}