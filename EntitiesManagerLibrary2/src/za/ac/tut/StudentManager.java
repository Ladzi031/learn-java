
package za.ac.tut;

import java.util.ArrayList;

public class StudentManager implements CommonOperations<Student>{

    private final ArrayList<Student> students;

    public StudentManager() {
        
        this.students = new ArrayList<>();
    }
    
    @Override
    public boolean add(Student t) {
        students.add(t);
        return true;
    }

    @Override
    public Student get(Student t) {
    
        if(students.contains(t)){
            return students.get(students.indexOf(t));
        }else {
            
            return null;
        }
    }
    

    @Override
    public ArrayList<Student> getAll() {
        if(students.isEmpty()){
            return null;
        }else {
            return students;
        }
    }
    @Override
    public boolean delete(Student t) {
        return students.remove(t);
    }

    @Override
    public boolean update(Student t) {
        if(students.contains(t)){
            int index = students.indexOf(t);
            students.set(index, t);
            return true;
        }else {
            return false;
        }
    }
    
}
