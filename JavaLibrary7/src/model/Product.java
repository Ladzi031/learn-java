
package model;
import java.sql.Timestamp;
/*
 * @author Ladzani_fabian
 */
public class Product {
    private Integer id;
    private String description;
    private Double unitPrice;
    private Integer quantity;
    private Timestamp timeStamp;

    public Product() {
        
    }

    public Product(Integer id, String description, Double unitPrice, Integer quantity, Timestamp timeStamp) {
        this.id = id;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.timeStamp = timeStamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return id + "," + description + "," + unitPrice + "," + quantity + "," + timeStamp;
    }
}
