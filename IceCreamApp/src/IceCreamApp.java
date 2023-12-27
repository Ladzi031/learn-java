//this program can still be structured well!
import javax.swing.JOptionPane;
public class IceCreamApp {
    
    public static void main(String[] args) {
        SteersIceCream iceCream1 = new SteersIceCream();
        String size = JOptionPane.showInputDialog(null,"select the size of the ice cream:","size of ice cream 2", JOptionPane.QUESTION_MESSAGE);
        char sizeOfIceCream  = size.charAt(0);
        //System.out.print("this is the size we tryna pass to the object: "+sizeOfIceCream);
        SteersIceCream iceCream2 = new SteersIceCream(sizeOfIceCream);
        
        String size2 = JOptionPane.showInputDialog(null,"select the size of the ice cream:","size of ice cream", JOptionPane.QUESTION_MESSAGE);
        String holder2 = JOptionPane.showInputDialog(null,"select the holder of the ice cream:","holder of ice cream", JOptionPane.QUESTION_MESSAGE);
        char sizeOfIceCream2 = size2.charAt(0);
        char sizeOfHolder2 = holder2.charAt(0);
        SteersIceCream iceCream3 = new SteersIceCream(sizeOfHolder2, sizeOfIceCream2);
        
        
       String deepSauce = JOptionPane.showInputDialog(null,"select the deep sauce you like:","Select deep Sauce", JOptionPane.QUESTION_MESSAGE);
       char deepSauceOfChoice = deepSauce.charAt(0);
       SteersIceCream iceCream4 = new SteersIceCream('c','l', true, deepSauceOfChoice);
       
       
       System.out.println("serving 4 ice-creams in a few minutes.");
       
       JOptionPane.showMessageDialog(null,iceCream1.details(),"results for ice-cream-1", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,iceCream2.details(),"results for ice-cream-2", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,iceCream3.details(),"results for ice-cream-3", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,iceCream4.details(),"results for ice-cream-4", JOptionPane.INFORMATION_MESSAGE);
       
       System.out.println("runtime success!");
    }
    
}
