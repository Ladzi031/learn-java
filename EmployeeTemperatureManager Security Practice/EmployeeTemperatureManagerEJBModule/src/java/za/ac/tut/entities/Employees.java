
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;


/**
 * @author Ladzani_fabian
 */
@Entity
public class Employees implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    @Column(nullable=false)
    private String name;
    
    @Column(nullable=false)
    private Double temperature;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;

    public Employees() {
    }

    public Employees( Long empId, String name, Double temperature, Date creationDate) {
        this.empId = empId;
        this.name = name;
        this.temperature = temperature;
        this.creationDate = creationDate;
    }
      
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
    public Long getId() {
        return empId;
    }

    public void setId(Long empId) {
        this.empId = empId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the empId fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        return !((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId)));
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Employee[ emp-Id=" + empId + " ]";
    }
    
}
