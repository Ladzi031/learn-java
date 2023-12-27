
package mulumba.entities;

import java.util.List;

/**
 * @author Ladzani_fabian
 */
public class Student {
    
    private String name;
    private String surname;
    private String studentNumber;
    private List<String> listOfSubjects;

   
    public Student(String name, String surname, String studentNumber, List<String> listOfSubjects) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.listOfSubjects = listOfSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<String> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(List<String> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
    
     @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", studentNumber=" + studentNumber + ", listOfSubjects=" + listOfSubjects + '}'+ "\n";
    }

}
