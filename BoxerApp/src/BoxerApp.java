import javax.swing.JOptionPane;
public class BoxerApp {
    
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Ladzani", 89.5);
        Boxer boxer2 = new Boxer("Lerato", 60.5);
        
        Boxer boxer3 = new Boxer();
        String boxerName = JOptionPane.showInputDialog(null,"What is your name?","Boxer Name", JOptionPane.QUESTION_MESSAGE);
        boxer3.setBoxerName(boxerName);
        String boxerWeight = JOptionPane.showInputDialog(null, "How much do you weigh?", "Boxer Weight:", JOptionPane.QUESTION_MESSAGE);
        double boxerWeightNumber = Double.parseDouble(boxerWeight);
        boxer3.setBoxerWeight(boxerWeightNumber);
        
        
         // get WeightCategory...
        String boxerCategory1 = boxer1.determineWeightCategory();
        String boxerCategory2 = boxer2.determineWeightCategory();
        String boxerCategory3 = boxer3.determineWeightCategory();
        
        // displaying results...
        System.out.println("first boxer lies in the "+ boxerCategory1 + " category");
        System.out.println("second boxer lies in the "+ boxerCategory2 + " category");
        System.out.println("third boxer lies in the "+ boxerCategory3 + " category");
        
    }
}
