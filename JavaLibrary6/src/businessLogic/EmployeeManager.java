
package businessLogic;


import entity.Employee;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
/*
 * @author Ladzani_fabian
 */
public class EmployeeManager implements DAOInterface<Employee> {
    
    private Connection connection;

    public EmployeeManager(String url, String userName, String password) throws SQLException{
        this.connection = makeConnectionWithDB(url, userName, password);
    }
    @Override
    public Boolean add(Employee t) throws SQLException {
        
        String sql = "INSERT INTO EMPTBL(IDNO,NAME,SURNAME,GENDER,AGE,DOB,SALARY) VALUES(?,?,?,?,?,?,?)";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        
        prepStatement.setInt(1, t.getIdNumber());
        prepStatement.setString(2,t.getName());
        prepStatement.setString(3, t.getSurname());
        prepStatement.setString(4, t.getGender());
        prepStatement.setInt(5, t.getAge());
        prepStatement.setDate(6, t.getDateOfBirth());
        prepStatement.setDouble(7, t.getSalary());
        
        prepStatement.executeUpdate();
        prepStatement.close();
        
        return true;
    }

    @Override
    public Boolean delete(Integer id) throws SQLException {
        
        String sql = "DELETE FROM EMPTBL WHERE IDNO=?";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        prepStatement.setInt(1, id);
        
        prepStatement.executeUpdate();
        
        prepStatement.close();
        
        return true;
    }

    @Override
    public Boolean update(Employee t) throws SQLException {
        
        String sql = "UPDATE EMPTBL SET SALARY=? WHERE IDNO=?";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        prepStatement.setDouble(1, t.getSalary());
        prepStatement.setInt(2, t.getIdNumber());
        
        prepStatement.executeUpdate();
        prepStatement.close();
        return true;     
    }

    @Override
    public Employee get(Integer id) throws SQLException {
        String sql = "SELECT IDNO,NAME,SURNAME,GENDER,AGE,DOB,SALARY FROM EMPTBL WHERE IDNO=?";
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        prepStatement.setInt(1, id);
        ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            Integer idNumber = resultSet.getInt("IDNO");
            String name = resultSet.getString("NAME");
            String surname = resultSet.getString("SURNAME");
            String gender = resultSet.getString("Gender");
            Integer age = resultSet.getInt("AGE");
            Date date = resultSet.getDate("DOB");
            Double salary = resultSet.getDouble("SALARY");
            
            Employee employee = new Employee(idNumber, name, surname, gender, age, date, salary);
            prepStatement.close();
            return employee;
        }else {
            prepStatement.close();
            return null;
        }
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT * FROM EMPTBL";
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
       while(resultSet.next()){
           Integer idNo = resultSet.getInt("IDNO");
           String name = resultSet.getString("NAME");
           String surname = resultSet.getString("SURNAME");
           String gender = resultSet.getString("GENDER");
           Integer age = resultSet.getInt("AGE");
           Date date = resultSet.getDate("DOB");
           Double salary = resultSet.getDouble("SALARY");
           
           Employee employee = new Employee(idNo, name, surname, gender, age, date, salary);
           employeeList.add(employee);
       }
       prepStatement.close();
       return employeeList;
    }

    private Connection makeConnectionWithDB(String url, String userName, String password) throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
    
}
