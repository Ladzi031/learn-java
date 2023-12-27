
package ladzani.bengane.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * @author Ladzani_fabian
 */
public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        setTitle("Ladzani Fabian Bengane");
        setDefaultLookAndFeelDecorated(true);
        setForeground(Color.red);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
