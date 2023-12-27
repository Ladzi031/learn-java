
package za.ac.tut.bl;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import za.ac.tut.entity.Student;

/**
 * @author Ladzani_fabian
 */
public class StudentsManagerDB implements DAOInteface<Student>{
    private Connection connection;

    public StudentsManagerDB(String dbURL, String username, String password) throws SQLException {
        this.connection = getConnection(dbURL, username, password);
    }

    
    
    @Override
    public boolean add(Student t) throws SQLException {
       String sql = 
       "INSERT INTO CLASSLISTTBL (STUDNUM, NAME, SURNAME, GENDER, AGE, NUMCOMPUTINGDEVICES, PERCTESTMARK) VALUES(?, ?, ?, ?, ?, ?, ?)";
       
       PreparedStatement prepStatment = connection.prepareStatement(sql);
       
       prepStatment.setInt(1, t.getStudNum());
       prepStatment.setString(2, t.getName());
       prepStatment.setString(3, t.getSurname());
       prepStatment.setString(4, t.getGender().toString());
       prepStatment.setInt(5, t.getAge());
       prepStatment.setInt(6, t.getNmComputingDevices());
       prepStatment.setInt(7, t.getPercTestMark());
       
       prepStatment.executeUpdate();
       prepStatment.close();
       return true;
       
    }

    @Override
    public boolean delete(Integer id) throws SQLException {
       String sql = "DELETE FROM CLASSLISTTBL WHERE STUDNUM = ?";
       PreparedStatement prepStatement = connection.prepareStatement(sql);
       
       prepStatement.setInt(1, id);
       
       prepStatement.executeUpdate();
       prepStatement.close();
       
       return true;
    }

    @Override
    public boolean update(Student t) throws SQLException {
        String sql = "UPDATE CLASSLISTTBL SET PERCTESTMARK = ? WHERE STUDNUM = ?";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        prepStatement.setInt(1, t.getPercTestMark());
        prepStatement.setInt(2, t.getStudNum());
        
        prepStatement.executeUpdate();
        prepStatement.close();
        
        return true;
    }

    @Override
    public Student get(Integer id) throws SQLException {
        Student student;
        String sql = "SELECT STUDNUM, NAME, GENDER, AGE, NUMCOMPUTINGDEVICES, PERCTESTMARK FROM CLASSLISTTBL WHERE STUDNUM = ?";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        prepStatement.setInt(1, id);
        
        ResultSet resultSet  = prepStatement.executeQuery();
        
        if(resultSet.next()){
            Integer studentNumber = resultSet.getInt("STUDNUM");
            String name = resultSet.getString("NAME");
            String surname = resultSet.getString("SURNAME");
            Character gender = resultSet.getString("GENDER").charAt(0);
            Integer age = resultSet.getInt("AGE");
            Integer numComputingDevices = resultSet.getInt("NUMCOMPUTINGDEVICES");
            Integer percTestMark = resultSet.getInt("PERCTESTMARK");
            
            student = new Student(studentNumber, name, surname, gender, age, numComputingDevices, percTestMark);
            
        }else {
            student = null;
        }
        prepStatement.close();
        
        return student;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        Student student;
        String name;
        String surname;
        Character gender;
        Integer studNum;
        Integer age;
        Integer numComputingDevices;
        Integer percTestMark;
        List<Student> studentsList = new ArrayList<>();
        
        String sql = "SELECT * FROM CLASSLISTTBL";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet = prepStatement.executeQuery();
        
        while (resultSet.next()) {
            name = resultSet.getString("NAME");
            surname = resultSet.getString("SURNAME");
            gender = resultSet.getString("GENDER").charAt(0);
            studNum = resultSet.getInt("STUDNUM");
            age = resultSet.getInt("AGE");
            numComputingDevices = resultSet.getInt("NUMCOMPUTINGDEVICES");
            percTestMark = resultSet.getInt("PERCTESTMARK");
            student = new Student(studNum, name, surname, gender, age, numComputingDevices, percTestMark);
            
            studentsList.add(student);
            
        }
        prepStatement.close();
        
        return studentsList;        
    }

    @Override
    public Integer getCnt() throws SQLException {
        Integer count;
        String sql = "SELECT COUNT(*) FROM CLASSLISTTBL";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            count = resultSet.getInt(1);
        }else {
            count = null;
        }
        
        prepStatement.close();
        return count;
    }

    @Override
    public Integer getLowestTestMark() throws SQLException {
        String sql = "SELECT MIN(PERCTESTMARK) FROM CLASSLISTTBL";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        Integer lowestMark;
        ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            lowestMark = resultSet.getInt(1);
        }else{
            lowestMark = null;
        }
        
        prepStatement.close();
        return lowestMark;
    }

    @Override
    public Integer getHighestTestMark() throws SQLException {
        Integer highestMark;
        
        String sql = "SELECT MAX(PERCTESTMARK) FROM CLASSLISTTBL";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet = prepStatement.executeQuery();
        
        if(resultSet.next()){
            highestMark = resultSet.getInt(1);
        }else {
            highestMark = null;
        }
        
        prepStatement.close();
        
        return highestMark;
    }

    @Override
    public Integer getAvgTestMark() throws SQLException {
        Integer averageTestMark;
        String sql = "SELECT AVG(PERCTESTMARK) FROM CLASSLISTTBL";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            averageTestMark = resultSet.getInt(1);
        }else {
            averageTestMark = null;
        }
        prepStatement.close();
        
        return averageTestMark;
    }

    @Override
    public Integer getAvgAge() throws SQLException {
        String sql = "SELECT AVG(AGE) FROM CLASSLISTTBL";
        Integer avgAge;
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet = prepStatement.executeQuery();
        
        if(resultSet.next()){
            
            avgAge = resultSet.getInt(1);
            
        }else {
            
            avgAge = null;
        }
        
        prepStatement.close();
        
        return avgAge;
    }

    @Override
    public Integer getNumPassed() throws SQLException {
        String sql = "SELECT COUNT(*) FROM CLASSLISTTBL WHERE PERCTESTMARK > 49";
        Integer numPassed;
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
        
        if(resultSet.next()){
            numPassed = resultSet.getInt(1);
        }else {
            numPassed = null;
        }
        prepStatement.close();
        
        return numPassed;
    }

    @Override
    public Integer getNumFailed() throws SQLException {
        String sql = "SELECT COUNT(*) FROM CLASSLISTTBL WHERE PERCTESTMARK < 50";
        Integer numFailed;
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
        
        if(resultSet.next()){
            numFailed = resultSet.getInt(1);
        }else {
            numFailed = null;
        }
        
        prepStatement.close();
        
        return numFailed;
    }

    @Override
    public Integer getNumPassed(Character gender) throws SQLException {
        String sql = "SELECT COUNT(*) FROM CLASSLISTTBL WHERE GENDER = ? AND PERCTESTMARK > 49";
        Integer numPassed;
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        prepStatement.setString(1, gender.toString());
       ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            numPassed = resultSet.getInt(1);
        }else {
            numPassed = null;
        }
        
        prepStatement.close();
        
        return numPassed;
    }

    @Override
    public Integer getNumFailed(Character gender) throws SQLException {
        Integer numFailed;
        String sql = "SELECT COUNT(*) FROM CLASSLISTTBL WHERE GENDER = ? AND PERCTESTMARK < 50";
        
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        prepStatement.setString(1, gender.toString());
       ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            numFailed = resultSet.getInt(1);
            
        }else {
            numFailed = null;
        }
        
        prepStatement.close();
        
        return numFailed;
        
    }

    @Override
    public List<Student> getPassed() throws SQLException {
        Student student;
        String name;
        String surname;
        Character gender;
        Integer studNum;
        Integer age;
        Integer numComputingDevices;
        Integer percTestMark;
        List<Student> studentList = new ArrayList<>();
        
        
        
        
        String sql = "SELECT * FROM CLASSLISTTBL WHERE PERCTESTMARK > 49";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next()){
            studNum = resultSet.getInt("STUDNUM");
            name = resultSet.getString("NAME");
            surname = resultSet.getString("SURNAME");
            gender = resultSet.getString("GENDER").charAt(0);
            age = resultSet.getInt("AGE");
            numComputingDevices = resultSet.getInt("NUMCOMPUTINGDEVICES");
            percTestMark = resultSet.getInt("PERCTESTMARK");
            
            student = new Student(studNum, name, surname, gender, age, numComputingDevices, percTestMark);
            studentList.add(student);
            
        }
       prepStatement.close();
       
       return studentList;
    }

    @Override
    public List<Student> getFailed() throws SQLException {
        Student student;
        String name;
        String surname;
        Character gender;
        Integer studNum;
        Integer age;
        Integer numComputingDevices;
        Integer percTestMark;
        List<Student> studentsList = new ArrayList<>();
        
        String sql = "SELECT * FROM CLASSLISTTBL WHERE PERCTESTMARK < 50";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        
        ResultSet resultSet  = prepStatement.executeQuery();
        
        while(resultSet.next()){
            studNum = resultSet.getInt("STUDNUM");
            name = resultSet.getString("NAME");
            surname = resultSet.getString("SURNAME");
            gender = resultSet.getString("GENDER").charAt(0);
            age = resultSet.getInt("AGE");
            numComputingDevices = resultSet.getInt("NUMCOMPUTINGDEVICES");
            percTestMark = resultSet.getInt("PERCTESTMARK");
            
            student = new Student(studNum, name, surname, gender, age, numComputingDevices, percTestMark);
            studentsList.add(student);
            
        }
        prepStatement.close();
        
        return studentsList;
    }

    @Override
    public Integer getTotalNumOfComputingDevices() throws SQLException {
        String sql = "SELECT SUM(NUMCOMPUTINGDEVICES) FROM CLASSLISTTBL";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
        Integer totalNumComputingDevices;
       if(resultSet.next()){
           totalNumComputingDevices = resultSet.getInt(1);
       }else {
           totalNumComputingDevices = null;
       }
       prepStatement.close();
       
       return totalNumComputingDevices;
    }
    
    private Connection getConnection(String dbURL, String username, String password) throws SQLException{
        return DriverManager.getConnection(dbURL, username, password);
    }
}
