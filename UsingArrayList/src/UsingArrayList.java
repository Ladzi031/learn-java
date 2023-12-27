import java.util.ArrayList;
public class UsingArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayListTesting personTest = new ArrayListTesting("mile", "bsdfje", "male");
        ArrayListTesting personTest2 = new ArrayListTesting("philipi", "jonga", "male");
        ArrayListTesting personTest3 = new ArrayListTesting("kennyy", "bengane", "trans");
        ArrayListTesting personTest4 = new ArrayListTesting("lowe", "clai", "male");
        ArrayListTesting personTest5 = new ArrayListTesting("john", "bengane", "female");

        ArrayList<ArrayListTesting> people = new ArrayList<>();
      people.add(personTest);
      people.add(personTest2);
      people.add(personTest3);
      people.add(personTest4);
      people.add(personTest5);
      
        System.out.println("about to iterate thru the people arraylist...");
      for(int i = 0; i < people.size(); i++){
          ArrayListTesting tempObject = people.get(i);
         String determineGender = tempObject.getGender();
         if(! determineGender.equalsIgnoreCase("male")){
             people.remove(i);
         }
      }
      
      
        System.out.println("finished iterating");
        System.out.println("the size of the arraylist is now: "+ people.size());    
    }
    
    
}
