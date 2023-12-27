package za.ac.tut.nursery;

import java.util.Random;
import javax.swing.JOptionPane;
import za.ac.tut.plant.Plant;

/**
 * @author Ladzani_fabian
 */

public class Nursery {
    public static void main(String[] args) {
        // TODO code application logic here
        Random makeRandom = new Random();
        int growthPerDay = makeRandom.nextInt(3, 10); //in millimetres
        String plantType = JOptionPane.showInputDialog(null, "Enter the type of plant you wish to create: ", "Plant Type", JOptionPane.QUESTION_MESSAGE);
        Plant plantFamily = new Plant(plantType, growthPerDay);
        String plantAge = JOptionPane.showInputDialog(null, "How old is the plant?", "Plant Age",JOptionPane.QUESTION_MESSAGE);
        int plantIntAge = Integer.parseInt(plantAge);
        JOptionPane.showMessageDialog(null, "the plant is of type: "+plantFamily.getPlantType()+ " and the growth since the day it was born is: "+plantFamily.growth(plantIntAge) ,"Plant Info",JOptionPane.INFORMATION_MESSAGE);
    } 
}
