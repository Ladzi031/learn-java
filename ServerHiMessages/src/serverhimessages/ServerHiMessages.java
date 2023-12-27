
package serverhimessages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class ServerHiMessages {
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader buffReader = null;
        String data = null;
        
        try {
            serverSocket = new ServerSocket(1234);
            socket = serverSocket.accept();
            
            buffReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            
            while( (data = buffReader.readLine()) != null){
                System.out.println("message from client: "+ data);
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerHiMessages.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            
            try {
                socket.close();
                buffReader.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerHiMessages.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
