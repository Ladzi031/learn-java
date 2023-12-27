package clientapp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientApp {

    public static void main(String[] args)
    {
        InetAddress addr = null;
        Socket socket = null;
        BufferedWriter out = null;
        
        
        try 
        {
            addr = InetAddress.getByName("127.0.0.1");
            System.out.println("Address: " + addr);
            
            socket = new Socket(addr, 9120);
            System.out.println("Socket: " + socket);
            
            out = new BufferedWriter(new PrintWriter(socket.getOutputStream()));
            
            String message = "hello mandisa";
            out.write(message);
            
            
        } 
        catch (IOException ex)
        {
            ex.printStackTrace();
        } 
        finally 
        {
            
            try {
                out.close();
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
