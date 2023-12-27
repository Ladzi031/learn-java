
package accountclientapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author 222157528
 */
public class AccountClientApp {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            Socket clientSocket = new Socket("localhost", 8089);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            int option = menu();

            while (option != 0) {
                if (option == 1) {
                    System.out.println();
                    System.out.println("CREATE ACCOUNT\n");

                    System.out.print("Enter your email: ");
                    String email = reader.nextLine();

                    System.out.print("Enter your password: ");
                    String password = reader.nextLine();

                    out.println(email);
                    out.println(password);

                    System.out.println("Account was created succesfully.\n");

                } else if (option == 2) {

                    System.out.println();
                    System.out.println("SIGN IN\n");

                    System.out.print("Email: ");
                    String email = reader.nextLine();

                    System.out.print("Password: ");
                    String password = reader.nextLine();

                    String response = in.readLine();
                    
                   System.out.print(response);
                }
                option = menu();
            }
        } catch (IOException ex) {
            Logger.getLogger(AccountClientApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static int menu() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose the options below:\n1. Create an account\n2. Sign in to the account\n0. Exit the program\n\nEnter here:");

        int option = reader.nextInt();

        return option;
    }

}
