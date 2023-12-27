package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * @author Ladzani_fabian
 */
public class GreetingsGui extends JFrame{
    
    
    // panels
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel nameAndSurnamePanel;
    private JPanel greetingsAreaPanel;
    private JPanel buttonsPanel;
    private JPanel mainPanel;
    private JPanel headingPanel;
    
    //labels
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    
    //textFields
    private JTextField nameTextField;
    private JTextField surnameTextField;
    
    //textArea
    private JTextArea greetingsTextArea;
    
    //buttons
    private JButton greetButton;
    private JButton clearButton;
    private JButton exitButton;
    
    
    public GreetingsGui(){
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(550, 650);
        setBackground(Color.yellow);
        
        
        // create the panels
         namePanel = new JPanel(new FlowLayout());
         surnamePanel = new JPanel(new FlowLayout());
         nameAndSurnamePanel = new JPanel(new GridLayout(2,1));
         
        greetingsAreaPanel = new JPanel(new FlowLayout());
        greetingsAreaPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        buttonsPanel = new JPanel(new FlowLayout());
        mainPanel = new JPanel(new BorderLayout());
        
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        //create the labels
        headingLabel  = new JLabel("Greetings App");
        nameLabel = new JLabel("Name:  ");
        surnameLabel = new JLabel("Surname: ");
        
        
        //create the TextField
        nameTextField = new JTextField(20);
        surnameTextField = new JTextField(20);
        
        //create the textArea
        greetingsTextArea = new JTextArea(40, 50);
        greetingsTextArea.setEditable(false);
        greetingsTextArea.setText("Hello [name] [surname]");
        
        // create the buttons
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        
        
        //add name_label && name_textfield to the name_panel
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        //add surname_label && surname_textField to the surname_panel
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        
        //add both name and surname PANELS to nameAndSurname_panel
        nameAndSurnamePanel.add(namePanel);
        nameAndSurnamePanel.add(surnamePanel);
        
        //add greetingsTextArea to its panel
        greetingsAreaPanel.add(greetingsTextArea);
        
        //add buttons to their buttons_panel;
        buttonsPanel.add(greetButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exitButton);
        
        
        mainPanel.add(nameAndSurnamePanel, BorderLayout.NORTH);
        mainPanel.add(greetingsAreaPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        // add the main panel to this Frame's panel
        add(headingPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        
        
        // make this frame visible
        setVisible(true);
    }
}
