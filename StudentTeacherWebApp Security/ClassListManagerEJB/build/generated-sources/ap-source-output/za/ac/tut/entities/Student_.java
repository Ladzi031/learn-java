package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-25T05:41:00")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Date> creationDate;
    public static volatile SingularAttribute<Student, Long> studentNum;
    public static volatile SingularAttribute<Student, Integer> age;

}