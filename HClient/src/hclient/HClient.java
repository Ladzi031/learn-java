
package hclient;

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
public class HClient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter writer = null;
        
        try {
            
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            
            socket  = new Socket(addr,1234);
            
            System.out.println("socket from client-side: "+ socket);
            
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            
            System.out.println("sending data!");
            writer.println("hello, from client application: "+HClient.class.getName());
            System.out.println("data sent!");
        } catch (UnknownHostException ex) {
            Logger.getLogger(HClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HClient.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            System.out.println("closing communication socket...");
            try {
                socket.close();
                
            } catch (IOException ex) {
                Logger.getLogger(HClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}
