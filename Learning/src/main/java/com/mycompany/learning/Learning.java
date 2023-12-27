package com.mycompany.learning;
import  javax.swing.JOptionPane;
/**
 *
 * @author Ladzani_fabian
 */
public class Learning{
    public static void main(String [] args){
        //JOptionPane.showMessageDialog(null, "This is an error message", "Error message", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"My information:\nLadzani\nBengane", "My Information", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Note that there is no icon","Plain Message", JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Are you a (m)ale or a (f)emale?","Gender", JOptionPane.QUESTION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"You forgot to add your cell phone number!","Missing Information",JOptionPane.WARNING_MESSAGE);
       
       //Getting input from the user
      String name = JOptionPane.showInputDialog(null,"Enter the day of the week","Input",JOptionPane.QUESTION_MESSAGE);
      System.out.print("will I be able to build java web & desktop applications one?: "+name);
       
    }
}
