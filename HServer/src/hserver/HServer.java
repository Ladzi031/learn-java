package hserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class HServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader buffReader = null;
        PrintWriter writer = null;
        try {
           serverSocket = new ServerSocket(1234);
           System.out.println("server started: "+ serverSocket);
            
           socket = serverSocket.accept();
           System.out.println("connection created: "+ socket);
            
           buffReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
           
           String data = buffReader.readLine();
           
           while(true){
               socket = serverSocket.accept();
               new RequestHandler(socket);
           }
            
           System.out.println("received this message from client ::-> "+data);
           
        } catch (IOException ex) {
            Logger.getLogger(HServer.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            System.out.println("Closing...");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(HServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
}
