
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CrecheForYou  extends JFrame{
    
    private ArrayList<Child> bana;
    private JLabel nameLab;
    private JLabel genderLab;
    
    private JTextField nameTextF;
    
    private JRadioButton button;
     private JRadioButton button1;
    
    private JButton but;
    private JButton but1;
    
    private JTextArea area;
    
    private ButtonGroup group;
    
    private JPanel namePanel ;
    private JPanel genderPanel;
    private JPanel buttonsPanel;
    private JPanel areaJPanel;
    
    private JPanel combinationPanel;
    private JPanel mainPanel;
    
    public CrecheForYou(){
        setTitle("cccc");
        
        
    nameLab = new JLabel("Name: ");
    genderLab = new JLabel("Gender: ");
     
    nameTextF = new JTextField(15);
    
    button = new JRadioButton("Male");
     
    button1 = new JRadioButton("Female");
    
    group = new ButtonGroup();
    group.add(button1);
    group.add(button);
    
    but = new JButton("Register kiddies");
    but.addActionListener(new RegisterButton());
    but1 = new JButton("Display kiddies");
    but1.addActionListener(new DisplayButton());
    
    area = new JTextArea(35,50);
    
    namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    areaJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    namePanel.add(nameLab);
    namePanel.add(nameTextF);
    
    genderPanel.add(genderLab);
    genderPanel.add(button);
    genderPanel.add(button1);
    
   
    buttonsPanel.add(but);
    buttonsPanel.add(but1);
    
    areaJPanel.add(area);
    
    combinationPanel = new JPanel(new GridLayout(3,1));
    combinationPanel.add(namePanel);
    combinationPanel.add(genderPanel);
    combinationPanel.add(buttonsPanel);
    
    mainPanel = new JPanel(new BorderLayout());
    
    mainPanel.add(combinationPanel , BorderLayout.NORTH);
    mainPanel.add(areaJPanel, BorderLayout.CENTER);
    
        pack();
        add(mainPanel);
        setVisible(true);
    
    
    }
    private class RegisterButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameTextF.getText();
            String gender = "";
            
            if(button.isSelected()){
            
                gender = "Male";
            }else{
                gender = "female";
            }
            Child kid = new Child(name, gender);
            
            bana = new ArrayList<>();
            
            bana.add(kid);
            nameTextF.setText("");
            
           
        }
        
    }
    private class DisplayButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            String answer = "";
            for (Child elements: bana) {
               answer = answer + elements.toString();
            }
            area.setText(answer);
            
        }
        
    }
    
    
}
