
package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/*
 * @author Ladzani_fabian
 */
public class BasicFrame extends JFrame{
    // Panels
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel nameAndSurnamePanel;
    private JPanel greetingAreaPanel;
    private JPanel buttonsPanel;
    private JPanel mainPanel;
    private JPanel headingPanel;
    
    // labels
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    
    //textfields
    private JTextField nameTextField;
    private JTextField surnameTextField;
    
    // textArea
    private JTextArea greetingsTextArea;
    
    //
    private JButton greetButton;
    private JButton clearButton;
    private JButton exitButton;
       
    public BasicFrame(){
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.yellow);
        
        //sort out the panels;
        namePanel = new JPanel(new FlowLayout());
        surnamePanel = new JPanel(new FlowLayout());
        
        nameAndSurnamePanel = new JPanel(new GridLayout(2, 1));
        greetingAreaPanel = new JPanel(new FlowLayout());
        greetingAreaPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        buttonsPanel = new JPanel(new FlowLayout());
        mainPanel = new JPanel(new BorderLayout());
        
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        // create the labels
        headingLabel = new JLabel("Greeting App");
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");
        
        nameTextField = new JTextField(15);
        surnameTextField = new JTextField(15);
        greetingsTextArea = new JTextArea(40, 50);
        greetingsTextArea.setEditable(false);
        greetingsTextArea.setText("Hello [name] [surname]");
        
        
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        headingPanel.add(headingLabel);
        
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        nameAndSurnamePanel.add(namePanel);
        nameAndSurnamePanel.add(surnamePanel);
        
        greetingAreaPanel.add(greetingsTextArea);
        
        buttonsPanel.add(greetButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exitButton);
        
        mainPanel.add(nameAndSurnamePanel,BorderLayout.NORTH);
        mainPanel.add(greetingAreaPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        this.add(headingPanel, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.setVisible(true);
        
    }

   
   
    
}




















