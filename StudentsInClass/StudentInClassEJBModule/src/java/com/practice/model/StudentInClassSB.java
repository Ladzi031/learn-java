package com.practice.model;

import com.practice.domain.Student;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

/**
 * @author Ladzani_fabian
 */
@Stateful
public class StudentInClassSB implements StudentInClassSBLocal {

    private Set<Student> classList = new HashSet<>();

    @Override
    public void add(Student student) {
        classList.add(student);
    }

    @Override
    public Boolean remove(String studentNumber) {
        Optional<Student> result = classList.stream()
                .filter(s -> s.getStudentNumber().equals(studentNumber))
                .findFirst();
        return result.isPresent() ? classList.remove(result.get()) : false;
    }

    @Override
    public Boolean update(String studentNumber, String newSurname) {
        for(Student student: classList) {
            if(Objects.equals(student.getStudentNumber(), studentNumber)) {
                student.setSurname(newSurname);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student getStudent(String studentNumber) {
       return classList.stream()
               .parallel()
               .filter(s -> s.getStudentNumber().equals(studentNumber))
               .findAny()
               .orElse(new Student());
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        classList.forEach(students::add);
        return students;
    }

}
