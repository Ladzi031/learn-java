
package classlistmanagerapp;
import java.sql.SQLException;
import java.util.Scanner;
import za.ac.tut.bl.StudentsManagerDB;
import za.ac.tut.entity.Student;

/**
 * @author Ladzani_fabian
 */
public class ClassListManagerApp {
    
    public static void main(String[] args) throws SQLException {
        Student student;
        int choice, studNum, numStuds, numPassed, numFailed, numFemalesPassed, numMalesPassed, numFemalesFailed;
        int avgTestMark, avgAge, highestTestMark, lowestTestMark, totalNumComputingDevices;
        
        StudentsManagerDB myDb = new StudentsManagerDB("jdbc:derby://localhost:1527/ClassListDB;create=true","app", "123");
        
        choice = displayChoice();
        while(choice != 7){
            switch (choice) {
                case 1:
                    student = getStudent();
                    myDb.add(student);
                    
                    break;
                case 2:
                    studNum = getStudentNumber();
                    myDb.delete(studNum);
                    
                    break;
                case 3:
                    
                    break;
                    
            }
        }
    }

    private static int getStudentNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static int displayChoice() {
        int choice;
Scanner sc = new Scanner(System.in);
System.out.print("\nPlease select one of the following options: " + "\n" +
"1 - add student" + "\n" +
"2 - delete student" + "\n" +
"3 - update student" + "\n" +
"4 - get student" + "\n" +
"5 - get all students" + "\n" +
"6 - get statistics" + "\n" +
"7 - exit" + "\n\n" +
"Your choice: ");
choice = sc.nextInt();
return choice;
    }

    private static Student getStudent() {
        int studNum, age, numComputingDevices, percTestMark;
String name, surname;
char gender;
Student student;
Scanner sc = new Scanner(System.in);
System.out.print("Please enter student number: ");
studNum = sc.nextInt();
System.out.print("Please enter student name: ");
name = sc.next();
System.out.print("Please enter student surname: ");
surname = sc.next();

System.out.print("Please enter student gender: ");
gender = sc.next().charAt(0);
System.out.print("Please enter student age: ");
age = sc.nextInt();
System.out.print("Please enter number of computing devices owned by the student: ");
numComputingDevices = sc.nextInt();
System.out.print("Please enter student perecntage test mark: ");
percTestMark = sc.nextInt();
student = new Student(studNum, name, surname, gender, age, numComputingDevices, percTestMark);
return student;
    }
    
}
