package ladzani.bengane.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Ladzani_fabian
 */
public class GreetUi extends JFrame{
    private final JLabel usernameLabel;
    private final JLabel passwordLabel;
    private final JLabel headingLabel;
    
    private final JPanel usernamePanel;
    private final JPanel passwordPanel;
    private final JPanel nameAndPasswordPanel;
    private final JPanel buttonPanel;
    private final JPanel headingPanel;
    
    
    private final JPasswordField passwordField;
    private final JTextField usernameField;
    
    private final JButton submitButton;
    
    public GreetUi(){
        setTitle("User Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setSize(350, 450);
        setLayout(new BorderLayout());
        
        
        // heading
        headingPanel = new JPanel(new FlowLayout());
        headingLabel = new JLabel("Login Details");
        
        headingPanel.add(headingLabel);
        
        //with username
        usernamePanel = new JPanel(new FlowLayout());
        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(25);
        
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);
        
        //with password
        passwordPanel = new JPanel(new FlowLayout());
        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(25);
        
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        
        //both Username and Password
        nameAndPasswordPanel = new JPanel(new GridLayout(2,1));
        nameAndPasswordPanel.add(usernamePanel);
        nameAndPasswordPanel.add(passwordPanel);
       
        
        //button
        buttonPanel = new JPanel(new  FlowLayout());
        submitButton = new JButton("Submit");
        
        buttonPanel.add(submitButton);
        
        
        
        add(headingPanel, BorderLayout.NORTH);
        add(nameAndPasswordPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
}
