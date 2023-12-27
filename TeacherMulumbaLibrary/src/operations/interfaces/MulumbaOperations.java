
package operations.interfaces;

import java.util.List;
import mulumba.entities.Student;

/**
 * @author Ladzani_fabian
 */
public interface MulumbaOperations {
    public boolean addStudent(Student student);
    public String showClassInfo();
    public boolean removeStudent(Student student);
    public boolean searchStudent(Student student);
    public boolean updateStudentSubjects(Student student, List<String> listOfSubjects);
    public void saveStudentListToFile();
}
