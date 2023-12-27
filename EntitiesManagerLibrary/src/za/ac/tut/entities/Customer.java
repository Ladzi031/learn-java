
package za.ac.tut.entities;

/**
 * @author Ladzani_fabian
 */
public class Customer {
    String customerName;
    Integer cusomterId;
    String productName;

    public Customer(String customerName, Integer cusomterId, String productName) {
        this.customerName = customerName;
        this.cusomterId = cusomterId;
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCusomterId() {
        return cusomterId;
    }

    public void setCusomterId(Integer cusomterId) {
        this.cusomterId = cusomterId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
}
