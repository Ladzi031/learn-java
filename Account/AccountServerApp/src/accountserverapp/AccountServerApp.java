package accountserverapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountServerApp {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8089);

            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String email = in.readLine();

            String password = in.readLine();

            Random value = new Random();
            int id = value.nextInt(100);

            addIntoDatabase(email, password, id);

             boolean isLoginSuccessful =  verifyUserCredentials(email, password);
            
             if (isLoginSuccessful) {
                    out.println("Login successful.");
                } else {
                    out.println("Login failed. Please check your email and password.");
                }


        } catch (IOException ex) {
            Logger.getLogger(AccountServerApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static boolean verifyUserCredentials(String email, String password)  {
try {
      Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LoginDB", "login", "123");

            // Query the database to find the user by email
            String query = "SELECT password FROM LOGINTBL WHERE email=?";
            PreparedStatement preparedStatement = cn.prepareStatement(query);
            preparedStatement.setString(1, email);
            
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                // User found, retrieve hashed password from the database
                String hashedPasswordFromDatabase = result.getString("password");

                return true;
            }
            
            } catch (Exception ex) {
            // Handle exceptions
        }

        return false;
    
    }

   private static void addIntoDatabase(String email, String password, int id) {
    try {
        Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LoginDB", "login", "123");

        String insert = "INSERT INTO LOGINTBL(email, password, id) VALUES(?,?,?) ";

        PreparedStatement ps = cn.prepareStatement(insert);

        ps.setString(1, email);
        ps.setString(2, password);
        ps.setInt(3, id);

        ps.executeUpdate(); // Execute the SQL INSERT statement

        ps.close(); // Close the PreparedStatement
        cn.close();  // Close the Connection

    } catch (SQLException ex) {
        Logger.getLogger(AccountServerApp.class.getName()).log(Level.SEVERE, null, ex);
    }
}


}
