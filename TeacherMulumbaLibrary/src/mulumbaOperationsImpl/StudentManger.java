
package mulumbaOperationsImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mulumba.entities.Student;
import operations.interfaces.MulumbaOperations;

/**
 * @author Ladzani_fabian
 */
public class StudentManger implements MulumbaOperations {
    
    private final List<Student> studentClassList;
     private String name;
    
    public StudentManger() {
       this.studentClassList = new ArrayList<>(); 
    }
    
    @Override
    public boolean addStudent(Student student) {
       studentClassList.add(student);
       return true;
    }

    @Override
    public String showClassInfo() {
        StringBuilder data = new StringBuilder("");
        
        for(Student student: studentClassList){
            data.append(student.toString());
        }
        return data.toString();
    }

    @Override
    public boolean removeStudent(Student student) {
        return studentClassList.remove(student);
    }

    @Override
    public boolean searchStudent(Student student) {
        return studentClassList.contains(student);
    }


    @Override
    public boolean updateStudentSubjects(Student student, List<String> listOfSubjects) {
       if(studentClassList.contains(student)){
           Student updateStudent =  studentClassList.get(studentClassList.indexOf(student));
           updateStudent.setListOfSubjects(listOfSubjects);
           return true;
       }else {
           return false;
       }
    }

    @Override
    public void saveStudentListToFile() {
        
        StringBuilder data = new StringBuilder("");
        
        try {
            BufferedWriter buffWrtier = new BufferedWriter(new FileWriter(new File("classListDetails.txt")));
            
            for(Student student: studentClassList){    
                data.append(student.toString());
            }
            
            buffWrtier.write(data.toString());
            
            buffWrtier.close();
            
        } catch (IOException e) {
            System.out.println("oops something went wrong!: "+ e.getMessage());
        }
    }
}
