
package hclient2;

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
public class HClient2 {

    public static void main(String[] args) {
        
        Socket socket = null ;
        PrintWriter writer;
        
        try {
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            socket = new Socket(addr, 1234);
            System.out.println("server details: "+ socket);
            
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
         
            System.out.println("sending data...");
            writer.println("hello from : "+ HClient2.class.getName());
            TimeUnit.SECONDS.sleep(1);
            System.out.println("data sent!");
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(HClient2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HClient2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(HClient2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(HClient2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
