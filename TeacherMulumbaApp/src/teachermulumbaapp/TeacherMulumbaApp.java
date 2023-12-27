
package teachermulumbaapp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import mulumbaOperationsImpl.StudentManger;
import mulumba.entities.Student;

/**
 * @author Ladzani_fabian
 */
public class TeacherMulumbaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("==============Class List Manager App =============");
        StudentManger manageStudents = new StudentManger();
        while(true){
            displayAppInstruction();
            int userOperation = sc.nextInt();
            
            switch (userOperation) {
                case 1:
                    String name;
                    String surname;
                    String studentNumber;
                    List<String> listOfSubject = new ArrayList<>();
                    
                    
                    
                    System.out.print("What is the name of the student: ");
                    name = sc.next();
                    
                    System.out.println("What is the surname of the student");
                    surname = sc.next();
                    
                    System.out.println("what is the best student number of the student");
                    studentNumber = sc.next();
                    
                    System.out.println("Student must have three subjects each:");
                    for(int i = 0; i < 2; i++){
                        System.out.println("add subject "+(i)+ " : ");
                        String tempName = sc.next();
                        listOfSubject.add(tempName);
                    }
                    
                    Student student = new Student(name, surname, studentNumber, listOfSubject);
                    if(manageStudents.addStudent(student)) {
                        System.out.println("Student succesfully added!");
                    }else {
                        System.out.println("student NOT added!");
                    }
                    
                    break;
                case 2:
                    manageStudents.showClassInfo();
                    break;
                case 3:
                    
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("======GOODBYE !=========");
                    System.exit(0);
                default:
                    System.out.println("Invalid number pressed, please try again!");
            }
        }
    }
    public static void displayAppInstruction(){
        System.out.println("""
                           press the number: [ 1 ]: to Add a student to the classList 
                           press the number: [ 2 ]: to Display the details of all student in the class 
                           press the number: [ 3 ]: to Remove a student from the classlist 
                           press the number: [ 4 ]: to Search for a student 
                           press the number: [ 5 ]: to Update the details of a student. 
                           press the number: [ 6 ]: to Store the contents of the list in a text file 
                           press the number: [ 7 ]: to EXIT the App 
                           """);
    }
    
}
