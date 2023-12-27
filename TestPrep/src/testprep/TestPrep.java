package testprep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestPrep {
    public static void main(String[] args) {
        String data = "";
        try {
            
            BufferedReader readFromFile = new BufferedReader(new FileReader("practicePrintWriter.txt"));
            
            int dataNum = readFromFile.read();
            
            while(dataNum != - 1){
                data += ((char) dataNum);
                dataNum = readFromFile.read();
            }
            
            readFromFile.close();
            
        } catch(IOException ex) {
            ex.getMessage();
        }
        
        System.out.println( "results: "+ data);
        
    }
}
