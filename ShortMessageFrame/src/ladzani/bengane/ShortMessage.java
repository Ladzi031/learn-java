
package ladzani.bengane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Ladzani_fabian
 */
public class ShortMessage extends JFrame{
    
    private final JLabel messageLabel;
    private final JTextField messageTextField;
    private final JPanel messagePanel;
    
    private final JButton runAnalysisButton;
    private final JButton saveToFileButton;
    private final JPanel buttonPanel;
    
    private final JPanel buttonAndNamePanel;
    
    private final JTextArea resultsTextArea;
    private final JPanel resultsPanel;
    
    private final JPanel mainPanel;
    
    
   public ShortMessage(){
       setTitle("Short Text Message");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setDefaultLookAndFeelDecorated(true);
       setResizable(true);
       
       messagePanel = new JPanel();
       messagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
       
       messageLabel = new JLabel();
       messageLabel.setText("Enter Short Message: ");
       
       messageTextField = new JTextField();
       messageTextField.setColumns(11);
       
       messagePanel.add(messageLabel);
       messagePanel.add(messageTextField);
       
       buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
       runAnalysisButton = new JButton("Run Analysis");
       
       runAnalysisButton.addActionListener(new Analysis());
       
       saveToFileButton = new JButton("Store to File");
       saveToFileButton.addActionListener(new SaveToFile());
       
       buttonPanel.add(runAnalysisButton);
       buttonPanel.add(saveToFileButton);
       
       buttonAndNamePanel = new JPanel(new GridLayout(2, 1, 1, 1));
       
       buttonAndNamePanel.add(messagePanel);
       buttonAndNamePanel.add(buttonPanel);
    
       
       resultsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
       resultsTextArea = new JTextArea(20, 30);
       resultsPanel.add(resultsTextArea);
       
       mainPanel = new JPanel(new BorderLayout());
       
       mainPanel.add(buttonAndNamePanel, BorderLayout.CENTER);
       mainPanel.add(resultsPanel, BorderLayout.SOUTH);
       
       this.add(mainPanel, BorderLayout.CENTER);
       this.pack();
       this.setVisible(true);
       
   }
   
   private class Analysis implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = messageTextField.getText();
            int numberOfWords = text.split(" ").length;
            
            String[] lettersArray =  text.split("");
            final String searchItem = ",";
            final String searchItem2 = ".";
            final String searchItem3 = " ";
            
            int numberOfCommas = 0;
            int numberOfFullStops = 0;
            int numberOfWhiteSpaces = 0;
            
            for(String item: lettersArray){
                if(searchItem.equals(item)){
                    numberOfCommas += 1; 
                }
                
                if(searchItem2.equals(item)){
                    numberOfFullStops += 1;
                }
                
                if(searchItem3.equals(item)){
                    numberOfWhiteSpaces += 1;
                }
            }
            
            //bytes size...
            // something ilogical with this here!!
            long byteSize = new File("C:\\Users\\Ladzani_fabian\\Documents\\NetBeansProjects\\ShortMessageApp\\messageAnalysis.txt").length();
            
            //format results
          String results =  String.format(""
                  + "The length of the message in terms of bytes: %s \n"
                    + "Number of words contained in the message: %s \n"
                    + "Number of commas: %s \n"
                    + "Number of full stops: %s \n"
                    + "Number of white spaces: %s \n", 
                  byteSize, numberOfWords, numberOfCommas, numberOfFullStops, numberOfWhiteSpaces);
            
          resultsTextArea.setText(results);
            //save to file
            
            
            
            
        }
       
   }
   
   private class SaveToFile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                
                File file = new File("C:\\Users\\Ladzani_fabian\\Documents\\NetBeansProjects\\ShortMessageApp\\messageAnalysis.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                if(!file.exists()){
                    file.createNewFile();
                    bufferedWriter.write(resultsTextArea.getText());
                    System.out.println("created a file and wrote to it");
                }else {
                    bufferedWriter.write(resultsTextArea.getText());
                    System.out.println("no need for creating of file, i already exist!");
                }
                
                bufferedWriter.close();
                System.out.println(file.getAbsoluteFile());
                System.out.println(file.length() + "length!! in bytes");
            }catch(IOException ex){
                
                System.out.println(ex.getMessage());
            }
            
            JOptionPane.showMessageDialog(null, "successfully saved to file!");
            
        }
    
}
    
}
