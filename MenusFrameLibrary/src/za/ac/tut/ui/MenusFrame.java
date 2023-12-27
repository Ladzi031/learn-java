package za.ac.tut.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Ladzani_fabian
 */
public class MenusFrame extends JFrame{
    private final JMenuBar menuBar;
    private final JMenu fileMenu;
    private final JMenu editMenu;
    private final JMenu viewMenu;
    private final JMenu editorsViewSubMenu;
    private final JMenu splitViewSubMenu;
    
    private final JMenuItem newProjectMenuItem;
    private final JMenuItem newFileMenuItem;
    private final JMenuItem openProjectMenuItem;
    private final JMenuItem openRecentProjectMenuItem;
    private final JMenuItem closeAllProjectMenuItem;
    
    private final JMenuItem undoMenuItem;
    private final JMenuItem redoMenuItem;
    private final JMenuItem cutMenuItem;
    private final JMenuItem copyMenuItem;
    private final JMenuItem pasteMenuItem;
    
    private final JMenuItem sourceMenuItem;
    
    private final JMenuItem horizontalMenuItem;
    private final JMenuItem verticalMenuItem;
    private final JMenuItem clearMenuItem;
    
    public MenusFrame(){
        setTitle("Menus Frame");
        setSize(700, 800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //CREATE THE MENU BAR
        menuBar = new JMenuBar();
        
        //menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        //file menu items
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectMenuItem = new JMenuItem("Close All Projects");
        
        //edit menu items
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut", new ImageIcon("images/cut.png")); // not sure if this will work out well!
        copyMenuItem = new JMenuItem("Copy", new ImageIcon("images/copy.png"));
        pasteMenuItem = new JMenuItem("Paste", new ImageIcon("images/paste.png"));
        
        //view menu items
        sourceMenuItem = new JMenuItem("Source");
        
        editorsViewSubMenu.add(sourceMenuItem);
        
        horizontalMenuItem = new JMenuItem("Horizontally");
        verticalMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        
        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(closeAllProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        viewMenu.add(editorsViewSubMenu);
        viewMenu.addSeparator();
        viewMenu.add(splitViewSubMenu);
        
        //add the menu to the bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        //add the menus to the bar
        this.setJMenuBar(menuBar); //attach menuBar to the frame!!
        
        //set the frame visible
        this.setVisible(true);
        
    }
      
}
