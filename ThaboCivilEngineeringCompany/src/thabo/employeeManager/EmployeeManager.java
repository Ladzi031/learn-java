package thabo.employeeManager;
import java.util.Stack;
import thabo.entities.Employee;
import thabo.inferfaces.EmployeeManagerInterface;
/**
 * @author Ladzani_fabian
 */
public class EmployeeManager implements EmployeeManagerInterface {
    private final Stack<Employee> stackDatabase;

    public EmployeeManager() {
        stackDatabase = new Stack<>();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        stackDatabase.push(employee);
        return true;
    }

    @Override
    public String showAllEmployeeInfo() {
        StringBuilder data = new StringBuilder("");
        for(Employee employee: stackDatabase){
            data.append(employee.toString());
        }
        return data.toString();
    }

    @Override
    public boolean searchEmployee(Employee employee) {
       return stackDatabase.search(employee) != -1;
    }

    @Override
    public boolean removeEmployee(Employee employee) {
        return stackDatabase.remove(employee);
    }

    @Override
    public boolean retrenchNumOfEmployees(int numOfEmployee) {
       if(stackDatabase.size() >= numOfEmployee){
           for(int i  = 0; i < numOfEmployee; i++){
            stackDatabase.pop();
           }
           return true;
       }else {
           System.out.println("the number of employees you want to retrench is less, than the number employees we actually have!");
           return false;
       }
       
    }

    @Override
    public boolean retrenchAllEmployees() {
        stackDatabase.clear();
        return true;
    }
    
    
}
