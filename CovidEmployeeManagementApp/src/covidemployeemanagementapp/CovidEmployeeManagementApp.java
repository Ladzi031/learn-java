
package covidemployeemanagementapp;

import app.bl.EmployeeManager;

/*
 * @author Ladzani_fabian
 */
public class CovidEmployeeManagementApp {
    public static void main(String[] args) {
        // TODO code application logic here
       var employeeManger = new EmployeeManager();
       employeeManger.recordEmployeeTemperature();
        System.out.println("\n\n\n");
       employeeManger.sortEmployeesByTemperature();
       System.out.println("\n\n\n");
       employeeManger.displayEmployeeDetails();
       System.out.println("done with the program!");   
    }
    
}
