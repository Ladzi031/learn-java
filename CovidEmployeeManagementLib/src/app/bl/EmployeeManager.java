
package app.bl;

import entity.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Ladzani_fabian
 */
public class EmployeeManager implements CovidEmployeeManagementInterface {
    
    private ArrayList<Employee> listOfEmployees;
    
    public EmployeeManager() {
        listOfEmployees = new ArrayList<>();
        clockInEmployees();
        
    }

    @Override
    public void recordEmployeeTemperature() {
        Scanner sc = new Scanner(System.in);
        int employeeTemp = 0;
        for(Employee emp: listOfEmployees){
            System.out.print("what is the temperature for employee with staff-Number:"+ emp.getStaffNumber()+ ": ");
            employeeTemp = sc.nextInt();
            emp.setTemperature(employeeTemp);
        }
    }

    @Override
    public void sortEmployeesByTemperature() {
        System.out.println("arrayList before sorting: "+ listOfEmployees);
        System.out.println("\n\n\n");
        listOfEmployees.sort(Collections.reverseOrder((emp1, emp2)-> { 
                    return emp1.getTemperature() - emp2.getTemperature(); 
        }));
        System.out.println("\n\n\n");
        System.out.println("arrayList after sorting(desc): "+ listOfEmployees);
    }

    @Override
    public void displayEmployeeDetails() {
        for(Employee emp: listOfEmployees){
            System.out.println(emp.toString());
        }
    }
    
    private void clockInEmployees(){
        
        for(int i = 1; i <= 10; i++){
            listOfEmployees.add(new Employee());
        }
        
        System.out.println("number of employees: "+ listOfEmployees.size());
    }
    
}
