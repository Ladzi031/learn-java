package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ladzani_fabian
 */
@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long studentNum;
    
    private String name;
    
    private Integer age;
    
   
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Student() {
    }

    public Student( Long studentNum, String name, Integer age, Date creationDate) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
        this.creationDate = creationDate;
    }

    public Long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNum != null ? studentNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentNum == null && other.studentNum != null) || (this.studentNum != null && !this.studentNum.equals(other.studentNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Student[ id=" + studentNum + " ]";
    }
    
}
