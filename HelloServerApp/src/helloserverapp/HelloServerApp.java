
package helloserverapp;

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
public class HelloServerApp {
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader buffReader = null;
        String data ;
        try {
            serverSocket = new ServerSocket(8081);
            System.out.println("Server started: "+ serverSocket);
            
            socket = serverSocket.accept();
            System.out.println("connection established: "+ socket);
            
            buffReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            data = buffReader.readLine();
            System.out.println("message received from client: "+ data);
            
        } catch (IOException ex) {
            Logger.getLogger(HelloServerApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            System.out.println("closing...");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(HelloServerApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
