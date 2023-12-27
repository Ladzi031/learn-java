
package helloclientapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class HelloClientApp {
    
    public static void main(String[] args) {
        // TODO code application logic here
        InetAddress addr = null;
        Socket socket = null;
        PrintWriter  out = null;
        
        try {
            addr = InetAddress.getByName("127.0.0.1");
            System.out.println("IP Address: "+ addr);
            
            socket = new Socket(addr, 8081);
            System.out.println("socket: "+ socket);
            
            
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            
            
            // send data to the server...
            out.println("Ladzi, first client/server communication   :)  ");
            System.out.println("message sent!");
        } catch (UnknownHostException ex) {
            Logger.getLogger(HelloClientApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HelloClientApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            System.out.println("closing communication socket...");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(HelloClientApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
