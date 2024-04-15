package com.practice.model;

import com.practice.domain.Student;
import jakarta.ejb.Local;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
@Local
public interface StudentInClassSBLocal {
    void add(Student student);
    Boolean remove(String studentNumber);
    Boolean update(String studentNumber, String newSurname);
    Student getStudent(String studentNumber);
    List<Student> getAllStudent();
}
