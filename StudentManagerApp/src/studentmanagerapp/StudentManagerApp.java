
package studentmanagerapp;

import java.util.ArrayList;
import java.util.Scanner;
import za.ac.tut.entities.Student;
import za.ac.tut.studentManager.StudentManager;

/**
 * @author Ladzani_fabian
 */
public class StudentManagerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        Student student;
        StudentManager manageStudent = new StudentManager();
        
        option = displayOptions();
        while(option != 6){
            switch (option) {
                case 1:
                    student = createStudent();
                    if(manageStudent.add(student)){
                        System.out.println("The student has been added");
                    }else {
                        System.out.println("The student was NOT found");   
                    }
                    break;
                case 2:
                    student = createStudent();
                    if(manageStudent.get(student) == null){
                        System.out.println("The student was NOT found");
                    }else {
                        System.out.println("The student was found");
                    }
                    break;
                case 3:
                    ArrayList<Student> studentList = manageStudent.getAll();
                    if(studentList.isEmpty()){
                        System.out.println("The list is empty"); 
                    }else {
                         displayStudents(studentList);
                    }
                    break;
                case 4:
                    student = createStudent();
                    if(manageStudent.delete(student)){
                        System.out.println("The student has been deleted.");
                    }else {
                        System.out.println("The student was NOT deleted.");
                    }
                    break;
                case 5:
                    student = createStudent();
                    if(manageStudent.update(student)){
                        System.out.println("The Student has been updated.");
                    }else {
                        System.out.println("The Student was NOT updated.");
                    }
                    break;
                case 6:
                    System.out.println("......GoodBye!......");
                    System.exit(0);
                default:
                    System.out.println(option + " is invalid. Please re-enter.");
            }
            option = displayOptions();
        }
    }
    public static void displayStudents(ArrayList<Student> studentList){
        String name;
        String data = "";
        int age;
        System.out.println("List of Students");
        System.out.println(".........................");
        
        for(Student stu: studentList){
            name = stu.getName();
            age = stu.getAge();
            data += "Name: "+ name + "\nAge: "+ age + "\n\n";
        }
        System.out.println(data);
    }
    public static Student createStudent(){
        String name;
        Integer age;
        //Student student;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter your name: ");
        name = sc.next();
        
        System.out.println("\nEnter your age: ");
        age = sc.nextInt();
        
        return new Student(name, age);
    } 
    public static int displayOptions(){
        int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           
                           Please select one of the following options: 
                           1 - Add Student 
                           2 - Get Student 
                           3 - Get All Student 
                           4 - Delete Student 
                           5 - Update Student 
                           6 - Exit Application 
                           
                           Your Option: """);
        option = sc.nextInt();
        
        return option;
    }
    
}
