
package studentapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.tut.bl.StudentManager;
import za.ac.tut.entity.Student;

/**
 * @author Ladzani_fabian
 */
public class StudentApp {
    public static void main(String[] args) {
        Student student;
        StudentManager studentManager = new StudentManager();
        File file = new File("mandisa.txt");
        ArrayList<Student> students;
        
        String option = userOption();
        
        while(! option.equals("e")){
            switch (option) {
                case "a":
                    student = createStudent();
                {
                    try {
                        studentManager.addStudent(student, file);
                    } catch (IOException ex) {
                        Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                    break;

                case "g":
                {
                    try {
                        students = studentManager.getStudents(file);
                        
                        displayStudents(students);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                 default:
                     System.out.println("please enter the correct letter!");
                     break;
            }
            option = userOption();
        }
        
        
    }
    public static String userOption()
    {
        Scanner sc = new Scanner(System.in);
        String option;
        
        System.out.println("Please select the following option:"+
                "Entering an ‘a’ to add a student into the classlist text file.\n" +
" Entering a ‘g’ to get the list of students from the classlist text file.\n" +
" Entering an ‘e’ to exit the application.");
        option = sc.next();
        
        return option;
    }

    private static Student createStudent() {
        Student student;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter name");
        String name = sc.next();
        System.out.println("Please enter age");
        int age = sc.nextInt();
        
        student = new Student(name, age);
        
        return student;
    }

    private static void displayStudents(ArrayList<Student> students) {
        
        for(Student student: students){
            System.out.println(student.toString());
            
        }
    }

    
}
