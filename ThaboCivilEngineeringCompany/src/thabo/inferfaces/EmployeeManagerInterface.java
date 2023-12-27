
package thabo.inferfaces;

import thabo.entities.Employee;

/**
 * @author Ladzani_fabian
 */
public interface EmployeeManagerInterface {
    public boolean addEmployee(Employee employee);
    public String showAllEmployeeInfo();
    public boolean searchEmployee(Employee employee);
    public boolean removeEmployee(Employee employee);
    public boolean retrenchNumOfEmployees(int numOfEmployee);
    public boolean retrenchAllEmployees();
}
