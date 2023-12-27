
package basicdatabaseconnectivity2app;

import ac.za.tut.bl.EmployeesManagerDB;
import ac.za.tut.entities.Employee;
import java.text.ParseException;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Date;
import java.util.List;
/**
 * @author Ladzani_fabian
 */
public class BasicDatabaseConnectivity2App {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.text.ParseException
     */
    
    public static void main(String[] args) throws SQLException, ParseException{
        int choice;
        int empID;
        Employee employee;
        EmployeesManagerDB database = new EmployeesManagerDB("jdbc:derby://localhost:1527/EmployeesDB;create=true", "app","123");
        
        choice = displayChoice();
        
        while(choice != 6){
            switch (choice) {
                case 1:
                    employee = getEmployee();
                    database.add(employee);
                    System.out.println("=======employee IS added========");
                    break;
                case 2:
                    empID = getEmployeeID();
                    database.delete(empID);
                    System.out.println("=====Employee is DELETED=====");
                    break;
                case 3:
                    employee = getEmployeeToUpdate();
                    database.update(employee);
                    System.out.println("=====Employee is UPDATED=====");
                    break;
                case 4:
                    empID = getEmployeeID();
                    employee = database.get(empID);
                    display(employee);
                    System.out.println("=====================================");
                    break;
                case 5:
                    List<Employee> employeesList = database.getAll();
                    displayAll(employeesList);
                    break;
            }
            choice = displayChoice();
        }
        
    }

    private static int displayChoice() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease select one of the following options: "+"\n"+
                "1 - Add employee\n"+""
                + "2 - Delete employee\n"+""
                + "3 - Update employee\n"+""
                + "4 - get employee\n"+""
                + "5 - get all employee\n"+""
                + "6 - exit \n\n"+""
                + "your choice: ");
        choice = sc.nextInt();
        return choice;
    }

    private static Employee getEmployee() throws ParseException{
        Integer employeeID;
        Integer age;
        String name;
        String surname;
        String dateOfBirth;
        String gender;
        Double salary;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter employee id: ");
        employeeID = sc.nextInt();
        System.out.print("Please enter employee name: ");
        name = sc.next();
        System.out.print("Please enter employee surname: ");
        surname = sc.next();
        System.out.print("Please enter employee gender: ");
        gender = sc.next().substring(0, 1);
        System.out.print("please enter employee age: ");
        age = sc.nextInt();
        System.out.print("Please enter employee salary: ");
        salary = sc.nextDouble();
        System.out.print("Please enter employee date of birth(yyyy-mm-dd): ");
        dateOfBirth = sc.next();
        Date date = Date.valueOf(dateOfBirth);
        
        Employee employee = new Employee(employeeID, name, surname, gender, age, date, salary);
        return employee;
    }

    private static int getEmployeeID() {
        int empID;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter employee id: ");
        empID = sc.nextInt();
        return empID;
    }

    private static Employee getEmployeeToUpdate() {
        Double salary;
        Integer idNo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter employee id: ");
        idNo = sc.nextInt();
        
        System.out.print("Please enter employee salary: ");
        salary = sc.nextDouble();
        
        Employee employee = new Employee();
        
        employee.setIdNumber(idNo);
        employee.setSalary(salary);
        
        
        return employee;
    }

    private static void display(Employee employee) {
        System.out.println(employee.toString());
    }

    private static void displayAll(List<Employee> employeesList) {
        employeesList.forEach(System.out::println);
        System.out.println("===========================================");
    }
    
}
