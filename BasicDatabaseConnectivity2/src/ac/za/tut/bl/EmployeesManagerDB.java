
package ac.za.tut.bl;

import ac.za.tut.entities.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
public class EmployeesManagerDB implements DAOInterface<Employee>{
    private final Connection connection;
    
    public EmployeesManagerDB(String databaseURL, String username, String password) throws SQLException {
        this.connection = getConnection(databaseURL, username, password);
    }
    @Override
    public Boolean add(Employee t) throws SQLException {
       String sql = "INSERT INTO EMPLOYEESTBL(IDNO, NAME, SURNAME, GENDER, AGE, DOB, SALARY)"+
               "VALUES(?,?,?,?,?,?,?)";
       PreparedStatement prepStatement = connection.prepareStatement(sql);
      
       prepStatement.setInt(1, t.getIdNumber());
       prepStatement.setString(2, t.getName());
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
       String sql = "DELETE FROM EMPLOYEESTBL WHERE IDNO=?"; 
       
       PreparedStatement prepStatement = connection.prepareStatement(sql);
       
       prepStatement.setInt(1, id);
       
       prepStatement.executeUpdate();
       
       prepStatement.close();
       
       return true;
    }

    @Override
    public Boolean update(Employee t) throws SQLException {
       String sql = 
               "UPDATE EMPLOYEESTBL SET SALARY = ? WHERE IDNO = ?";
       PreparedStatement prepStatement = connection.prepareStatement(sql);
       prepStatement.setDouble(1, t.getSalary());
       prepStatement.setInt(2, t.getIdNumber());
       
       prepStatement.executeUpdate();
       prepStatement.close();
       return true;
    }

    @Override
    public Employee get(Integer id) throws SQLException {
        String sql = "SELECT IDNO, NAME, SURNAME, GENDER, AGE, DOB, SALARY FROM EMPLOYEESTBL WHERE IDNO = ?";
        PreparedStatement prepStatement  = connection.prepareStatement(sql);
        
        prepStatement.setInt(1, id);
        ResultSet resultSet  = prepStatement.executeQuery();
        if(resultSet.next()){
            Integer idNo = resultSet.getInt("IDNO");
            String name = resultSet.getString("NAME");
            String surname = resultSet.getString("SURNAME");
            String gender = resultSet.getString("GENDER");
            Integer age = resultSet.getInt("AGE");
            Date dateOfBirth = resultSet.getDate("DOB");
            Double salary = resultSet.getDouble("SALARY");
            
            Employee employee = new Employee(idNo, name, surname, gender, age, dateOfBirth, salary);
            prepStatement.close();
            return employee;
        }else {
            prepStatement.close();
            return null;
        }
        
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEESTBL";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet results = prepStatement.executeQuery();
        while(results.next()){
        
            Integer idNo = results.getInt("IDNO");
            String name = results.getString("NAME");
            String surname = results.getString("SURNAME");
            String gender = results.getString("GENDER");
            Integer age = results.getInt("AGE");
            Date dateOfBirth = results.getDate("DOB");
            Double salary = results.getDouble("SALARY");
            
            Employee employee = new Employee(idNo, name, surname, gender, age, dateOfBirth, salary);
            employees.add(employee);
        }
        prepStatement.close();
        
        return employees;
    }

    private Connection getConnection(String databaseURL, String username, String password) throws SQLException {
       return DriverManager.getConnection(databaseURL, username, password);
       
       //Connection connection;
       // connection = DriverManager.getConnection(databaseURL, usrname, password);
       // return connection;
    }
}
