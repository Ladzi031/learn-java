
package clienthimessages;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class ClientHiMessages {
    
    public static void main(String[] args) {
       InetAddress serverAddress = null;
       Socket socket = null;
       PrintWriter writer = null;
       
        try {
            serverAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(serverAddress, 1234);
            
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
            
            for(int i = 0; i < 100; i++){
                writer.println("hello "+  (i+1));
                TimeUnit.SECONDS.sleep(4L);
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientHiMessages.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientHiMessages.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientHiMessages.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
           try {   
               socket.close();
               writer.close();
               
           } catch (IOException ex) {
               Logger.getLogger(ClientHiMessages.class.getName()).log(Level.SEVERE, null, ex);
           }
            System.out.println(" Closed connnection.... from client!");
        }
    }
}
