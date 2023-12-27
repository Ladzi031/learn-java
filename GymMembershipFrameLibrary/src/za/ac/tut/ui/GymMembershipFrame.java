package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 * @author Ladzani_fabian
 */
public class GymMembershipFrame extends JFrame{
    
    //panels
    private final JPanel headingPanel;
    private final JPanel clientPanel;
    private final JPanel namePanel;
    private final JPanel surnamePanel;
    private final JPanel idNumberPanel;
    private final JPanel genderPanel;
    private final JPanel contractsPanel;
    private final JPanel personalTrainerOptionPanel;
    private final JPanel membershipPanel;
    private final JPanel commentsPanel;
    private final JPanel buttonsPanel;
    private final JPanel headingClientCombinePanel;
    private final JPanel membershipCommentsCombinedPanel;
    private final JPanel mainPanel;
     
    //labels
    private final JLabel headingLabel;
    private final JLabel nameLabel;
    private final JLabel surnameLabel;
    private final JLabel idNumberLabel;
    private final JLabel genderLabel;
    private final JLabel personalTrainerLabel;
    private final JLabel contractTypeLabel;
    
    //textFields
    private final JTextField nameTextField;
    private final JTextField surnameTextField;
    private final JTextField idNumberTextField;
    
    //comboBox
    private final JComboBox genderComboBox;
    
    //radio Buttons
    private final JRadioButton monthToMonthRadioButton;
    private final JRadioButton sixMonthsRadioButton;
    private final JRadioButton annualRadioButton;
    
    //checkBox
    private final JCheckBox personalTrainerCheckBox;
    
    //buttonGroup
    private final ButtonGroup buttonGroup;
    
    //textArea
    private final JTextArea commentsArea;
    
    //scrollPane
    private final JScrollPane scrollableTextArea;
    
    //button
    private final JButton applyButton;
    
    
    public GymMembershipFrame(){
        setTitle("Gym memebership");
        setSize(500, 500);
        
        //create Panels;
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        clientPanel = new JPanel(new GridLayout(4, 1, 1, 1));
        clientPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1, true), "Client Details"));
        
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNumberPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPanel = new JPanel(new GridLayout(2,1,1,1));
        membershipPanel.setBorder(new TitledBorder(new LineBorder(Color.GREEN,2),"Contract Options"));
        
        commentsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinePanel = new JPanel(new BorderLayout());
        membershipCommentsCombinedPanel = new JPanel(new BorderLayout());
        mainPanel = new JPanel(new BorderLayout()); //Note: Note No More Than 5 Components!
        
        
        //create Labels;
        headingLabel = new JLabel("Membership Form");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD,20));
        headingLabel.setForeground(Color.RED);
        headingLabel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        
        nameLabel = new JLabel("Name:       "); // get the correct spacing!
        surnameLabel = new JLabel("Surname: ");
        idNumberLabel = new JLabel("ID Number: ");
        genderLabel = new JLabel("Gender:   "); // get the correct spacing!
        contractTypeLabel = new JLabel("Type of contract:  ");
        personalTrainerLabel = new JLabel("Select the checkbox if you need a personal trainer: ");
        
        //create textfields;
        final int COLUMNS = 10;
        nameTextField = new JTextField(COLUMNS);
        surnameTextField = new JTextField(COLUMNS);
        idNumberTextField = new JTextField(COLUMNS);
        
        //create combobox;
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        //create radio buttons
        monthToMonthRadioButton = new JRadioButton("Month-to-Month");
        sixMonthsRadioButton = new JRadioButton("Six months");
        annualRadioButton = new JRadioButton("Annual");
        
        //create checkBox;
        personalTrainerCheckBox = new JCheckBox();
        
        //create button group
        buttonGroup = new ButtonGroup();
        buttonGroup.add(monthToMonthRadioButton);
        buttonGroup.add(sixMonthsRadioButton);
        buttonGroup.add(annualRadioButton);
        
        //create text area
        commentsArea = new JTextArea(20, 40);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Comments"));
        
        scrollableTextArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        //create button
        applyButton = new JButton("APPLY");
        
        //add components to panels;
        headingPanel.add(headingLabel);
        
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        idNumberPanel.add(idNumberLabel);
        idNumberPanel.add(idNumberTextField);
        
        
        genderPanel.add(genderLabel);
        genderPanel.add(genderComboBox);
        
        clientPanel.add(namePanel);
        clientPanel.add(surnamePanel);
        clientPanel.add(idNumberPanel);
        clientPanel.add(genderPanel);
        
        headingClientCombinePanel.add(headingPanel, BorderLayout.NORTH);
        headingClientCombinePanel.add(clientPanel, BorderLayout.CENTER);
        
        contractsPanel.add(contractTypeLabel);
        contractsPanel.add(monthToMonthRadioButton);
        contractsPanel.add(sixMonthsRadioButton);
        contractsPanel.add(annualRadioButton);
        
        personalTrainerOptionPanel.add(personalTrainerLabel);
        personalTrainerOptionPanel.add(personalTrainerCheckBox);
        
        membershipPanel.add(contractsPanel);
        membershipPanel.add(personalTrainerOptionPanel);
        
        commentsPanel.add(scrollableTextArea);
        membershipCommentsCombinedPanel.add(membershipPanel, BorderLayout.NORTH);
        membershipCommentsCombinedPanel.add(commentsPanel, BorderLayout.CENTER);
        
        buttonsPanel.add(applyButton);
        
        
        mainPanel.add(headingClientCombinePanel, BorderLayout.NORTH);
        mainPanel.add(membershipCommentsCombinedPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
    }
}
