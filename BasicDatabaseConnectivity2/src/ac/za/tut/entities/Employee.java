
package ac.za.tut.entities;

import java.sql.Date;

/**
 * @author Ladzani_fabian
 */
public class Employee {
    private Integer IdNumber;
    private String name;
    private String surname;
    private String gender;
    private Integer age;
    private Date dateOfBirth;
    private Double salary;

    public Employee() {}

    public Employee(Integer IdNumber, String name, String surname, String gender, Integer age, Date dateOfBirth, Double salary) {
        this.IdNumber = IdNumber;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public Integer getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(Integer IdNumber) {
        this.IdNumber = IdNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return IdNumber + "," + name + "," + surname + "," + gender + "," + age + "," + dateOfBirth + "," + salary;
    }
}
