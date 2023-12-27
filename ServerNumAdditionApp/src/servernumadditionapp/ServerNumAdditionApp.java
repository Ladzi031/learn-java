
package servernumadditionapp;

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
public class ServerNumAdditionApp {
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
            data = buffReader.readLine();
            int sum = 0;
           
            String num1 = data.split("")[0];
            String num2 = data.split("")[1];
           
            sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            
            System.out.println("operation: Addition");
            System.out.println("the answer to: "+ num1 + " and "+ num2 + " is: "+ sum);
            
        } catch (IOException ex) {
            Logger.getLogger(ServerNumAdditionApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                socket.close();
                buffReader.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerNumAdditionApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
               
    }
    
}
