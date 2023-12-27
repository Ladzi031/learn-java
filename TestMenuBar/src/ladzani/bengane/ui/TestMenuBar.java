
package ladzani.bengane.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Ladzani_fabian
 */
public class TestMenuBar extends JFrame{
    private final JMenuBar menuBar;
    private final JMenu fileMenu;
    private final JMenu editMenu;
    private final JMenu formatMenu;
    private final JMenu viewMenu;
    private final JMenu helpMenu;
    
    private final JMenuItem viewHelpMenuItem;
    private final JMenuItem sendFeedBackMenuItem;
    private final JMenuItem aboutNotePadMenuItem;
    
    public TestMenuBar(){
        this.setTitle("Ladzani Bengane Practice Menu Bar");
        this.setSize(550, 650);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        this.setResizable(true);
        
        //menuBar
        menuBar = new JMenuBar();
        
        //menu
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        formatMenu = new JMenu("Format");
        viewMenu = new JMenu("View");
        helpMenu = new JMenu("Help");
        
        
        //menuItems
        viewHelpMenuItem = new JMenuItem("View Help");
        sendFeedBackMenuItem = new JMenuItem("Send Feedback");
        aboutNotePadMenuItem = new JMenuItem("About Notepad");
        
        //add menuItem to help menu
        helpMenu.add(viewHelpMenuItem);
        helpMenu.add(sendFeedBackMenuItem);
        helpMenu.addSeparator();
        helpMenu.add(aboutNotePadMenuItem);
        
        //add menu to menuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);
        
        
        this.setJMenuBar(menuBar); // attach frame to the current frame!
        
        this.setVisible(true);
        
        
    }
}
