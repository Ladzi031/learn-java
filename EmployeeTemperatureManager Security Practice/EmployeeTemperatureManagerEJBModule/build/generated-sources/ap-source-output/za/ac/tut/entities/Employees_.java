package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-25T17:16:03")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, Long> empId;
    public static volatile SingularAttribute<Employees, String> name;
    public static volatile SingularAttribute<Employees, Double> temperature;
    public static volatile SingularAttribute<Employees, Date> creationDate;

}