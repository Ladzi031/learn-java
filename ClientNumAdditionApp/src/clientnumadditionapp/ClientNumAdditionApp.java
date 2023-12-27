
package clientnumadditionapp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class ClientNumAdditionApp {
    
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter writer = null;
        try {
            // TODO code application logic here
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
             socket = new Socket(serverAddress, 1234);
            
            String num1 = "5";
            String num2 = "5";
            
             writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            
            writer.println(num1+ num2); // join the two strings...
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientNumAdditionApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientNumAdditionApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            
            try {
                socket.close();
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientNumAdditionApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
     
    
}
