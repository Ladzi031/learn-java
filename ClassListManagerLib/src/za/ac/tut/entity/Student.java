package za.ac.tut.entity;
/**
 * @author Ladzani_fabian
 */
public class Student {
    private Integer studNum;
    private String name;
    private String surname;
    private Character gender;
    private Integer age;
    private Integer nmComputingDevices;
    private Integer percTestMark;

    public Student() {
    }

    public Student(Integer studNum, String name, String surname, Character gender, Integer age, Integer nmComputingDevices, Integer percMarkObtained) {
        this.studNum = studNum;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.nmComputingDevices = nmComputingDevices;
        this.percTestMark = percMarkObtained;
    }

    public Integer getStudNum() {
        return studNum;
    }

    public void setStudNum(Integer studNum) {
        this.studNum = studNum;
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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNmComputingDevices() {
        return nmComputingDevices;
    }

    public void setNmComputingDevices(Integer nmComputingDevices) {
        this.nmComputingDevices = nmComputingDevices;
    }

    public Integer getPercTestMark() {
        return percTestMark;
    }

    public void setPercTestMark(Integer percMarkObtained) {
        this.percTestMark = percMarkObtained;
    }
    
    @Override
    public String toString() {
        return "{" + studNum + ", " + name + ", " + surname + ", " + gender + ", " + age + ", " + nmComputingDevices + ", " + percTestMark + '}';
    }
}
