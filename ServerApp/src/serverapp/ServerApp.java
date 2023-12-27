package serverapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerApp {

    public static void main(String[] args) 
    {
        ServerSocket ss = null;
        Socket socket = null;
        BufferedReader in = null;
        
        try 
        {
            ss = new ServerSocket(9120);
            
            socket = ss.accept();
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();
            System.out.println("the message is: "+ message);
        }
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        finally 
        {
            try {
                socket.close();
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
