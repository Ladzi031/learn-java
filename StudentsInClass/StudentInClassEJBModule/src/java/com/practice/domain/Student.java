package com.practice.domain;

/**
 * @author Ladzani_fabian
 */
public class Student {

    private String name;
    private String surname;
    private String studentNumber;

    public Student() {
    }

    public Student(String name, String surname, String studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", studentNumber=" + studentNumber + '}';
    }

}
