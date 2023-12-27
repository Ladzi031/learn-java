package testing.employee;

import java.io.*;

/**
 * @author Ladzani_fabian
 */
public class AddEmployee implements  Serializable{
    private String empName;
    private int empStaffNumber;

    public AddEmployee(String empName, int empStaffNumber) {
        this.empName = empName;
        this.empStaffNumber = empStaffNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpStaffNumber() {
        return empStaffNumber;
    }

    public void setEmpStaffNumber(int empStaffNumber) {
        this.empStaffNumber = empStaffNumber;
    }
    
}
