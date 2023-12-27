
package multithreadedservermathapp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ladzani_fabian
 */
public class MultiThreadedServerMathApp {
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket serverSocket = null;
        Socket socket = null;
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        
        try { 
            serverSocket = new ServerSocket(1234);
            
            
            
            while(true){
                socket = serverSocket.accept();
                executorService.execute(new Task(socket));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(MultiThreadedServerMathApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            
            executorService.shutdown();
            
            try {
                socket.close();
                
            } catch (IOException ex) {
                Logger.getLogger(MultiThreadedServerMathApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
