
package za.ac.tut.studentManager;

import java.util.ArrayList;
import za.ac.tut.commonoperations.CommonOperations;
import za.ac.tut.entities.Student;

/**
 * @author Ladzani_fabian
 */
public class StudentManager implements CommonOperations<Student>{
    private final ArrayList<Student> studentsList;

    public StudentManager() {
        studentsList = new ArrayList<>();
    }
    

    @Override
    public boolean add(Student t) {
        studentsList.add(t);
        return true;
    }

    @Override
    public Student get(Student t) {
        if(studentsList.contains(t)){
            return studentsList.get(studentsList.indexOf(t));
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Student> getAll() {
        return studentsList.isEmpty() ? null : studentsList;
    }

    @Override
    public boolean delete(Student t) {
        //probably have to check if this student exists in the face place before deleting it, nonetheless
        // two types of the remove method.... one returns a boolean value and one returns the object that is being removed or null
        return studentsList.remove(t); 
    }

    @Override
    public boolean update(Student t) {
         if(studentsList.contains(t)){
            int index = studentsList.indexOf(t);
            studentsList.set(index, t);
            return true;
         }else{
             return false;
         }
    }
    
}
