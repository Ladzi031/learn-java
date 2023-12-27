package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * @author Ladzani_fabian
 */
public class TicketsFrame extends JFrame{
    
    // create the panels
    private final JPanel headingPanel;
    private final JPanel namePanel;
    private final JPanel surnamePanel;
    private final JPanel cellphonePanel;
    private final JPanel customerDetailsPanel;
    private final JPanel homeTeamPanel;
    private final JPanel awayTeamPanel;
    private final JPanel ticketCostPanel;
    private final JPanel numberTicketPanel;
    private final JPanel totalAmountDuePanel;
    private final JPanel ticketsPanel;
    private final JPanel buttonsPanel;
    private final JPanel ticketsButtonsCombinePanel;
    private final JPanel mainPanel;
    
    //create the Labels
    private final JLabel headingLabel;
    private final JLabel nameLabel;
    private final JLabel surnameLabel;
    private final JLabel cellphoneLabel;
    private final JLabel homeTeamLabel;
    private final JLabel awayTeamLabel;
    private final JLabel ticketCostLabel;
    private final JLabel numberTicketsLabel;
    private final JLabel totalAmountDueLabel;
    
    //textFields
    private final JTextField nameTextField;
    private final JTextField surnameTextField;
    private final JTextField cellphoneTextField;
    private final JTextField homeTeamTextField;
    private final JTextField awayTeamTextField;
    private final JTextField ticketCostTextField;
    private final JTextField totalAmountDueTextField;
    
    //JSlider here!
    private final JSlider numberTicketsSlider;
    
    //buttons
    private final JButton buyButton;
    private final JButton clearButton;
    private final JButton exitButton;
    
    //construct the Frame...
    public TicketsFrame(){
        this.setTitle("Ticket Sales");
        this.setSize(600, 650);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //create the panels;
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        customerDetailsPanel = new JPanel(new GridLayout(3, 1, 1, 1 ));
        customerDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.RED, 1), "Customer details"));
        
        homeTeamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberTicketPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalAmountDuePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPanel  = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketsPanel.setBorder(new TitledBorder(new LineBorder(Color.MAGENTA, 1),"Tickets details"));
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsButtonsCombinePanel = new JPanel(new BorderLayout());
        mainPanel = new JPanel(new BorderLayout());
        
        //labels
        headingLabel = new JLabel("Soccer Match Tickets");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 40));
        headingLabel.setForeground(Color.CYAN);
        
        nameLabel = new JLabel("Name:     ");
        surnameLabel = new JLabel("Surname:   ");
        cellphoneLabel = new JLabel("Cellphone:  ");
        homeTeamLabel = new JLabel("Home Team:  ");
        awayTeamLabel = new JLabel("Away Team:  ");
        ticketCostLabel = new JLabel("Cost price:  R");
        numberTicketsLabel = new JLabel("Number of tickers required:  ");
        totalAmountDueLabel = new JLabel("Total amount due:  R");
        
        //textfields
        final int COLUMNS = 10;
        nameTextField = new JTextField(COLUMNS);
        nameTextField.setFocusable(true);
        
        surnameTextField = new JTextField(COLUMNS);
        cellphoneTextField = new JTextField(COLUMNS);
        homeTeamTextField = new JTextField(COLUMNS);
        awayTeamTextField = new JTextField(COLUMNS);
        ticketCostTextField = new JTextField(COLUMNS);
        
        totalAmountDueTextField = new JTextField(COLUMNS + 5);
        totalAmountDueTextField.setText("To be calculated later. ");
        totalAmountDueTextField.setEditable(false);
        
        numberTicketsSlider = new JSlider(1, 20);
        
        //create buttons
        buyButton = new JButton();
        buyButton.setText("Buy");
        
       clearButton = new JButton("Clear");
       exitButton = new JButton("Exit");
       
        //add components to panels;
        headingPanel.add(headingLabel);
        
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        cellphonePanel.add(cellphoneLabel);
        cellphonePanel.add(cellphoneTextField);
        
        customerDetailsPanel.add(namePanel); // ----> FIRST COLLECTIVE PANELS
        customerDetailsPanel.add(surnamePanel);
        customerDetailsPanel.add(cellphonePanel);
        
        homeTeamPanel.add(homeTeamLabel);
        homeTeamPanel.add(homeTeamTextField);
        
        awayTeamPanel.add(awayTeamLabel);
        awayTeamPanel.add(awayTeamTextField);
        
        ticketCostPanel.add(ticketCostLabel);
        ticketCostPanel.add(ticketCostTextField);
        
        numberTicketPanel.add(numberTicketsLabel);
        numberTicketPanel.add(numberTicketsSlider); // silder is here!
        
        totalAmountDuePanel.add(totalAmountDueLabel);
        totalAmountDuePanel.add(totalAmountDueTextField);
        
        ticketsPanel.add(homeTeamPanel); // ---> second collective panel
        ticketsPanel.add(awayTeamPanel);
        ticketsPanel.add(ticketCostPanel);
        ticketsPanel.add(numberTicketPanel);
        ticketsPanel.add(totalAmountDuePanel);
        
        buttonsPanel.add(buyButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exitButton);
        
        ticketsButtonsCombinePanel.add(ticketsPanel, BorderLayout.CENTER); // ---> third collective panel
        ticketsButtonsCombinePanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        mainPanel.add(headingPanel, BorderLayout.NORTH);
        mainPanel.add(customerDetailsPanel, BorderLayout.CENTER);
        mainPanel.add(ticketsButtonsCombinePanel, BorderLayout.SOUTH);
        
        //add main frame to the panel of the current frame
        this.add(mainPanel);
        
        //pack
        this.pack();
        
        //make frame visible
        this.setVisible(true);
    }
    
}
