
package thabo.entities;

/**
 * @author Ladzani_fabian
 */
public class Employee {
    private String employeeName;
    private String employeeID;

    public Employee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeName=" + employeeName + ", employeeID=" + employeeID + '}'+ "\n";
    }
    
}
