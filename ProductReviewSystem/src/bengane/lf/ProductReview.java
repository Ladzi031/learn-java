package bengane.lf;
import java.io.Serializable;
import java.util.Random;

public class ProductReview implements Serializable{
    private static final long serialVersionUID = 6529685098267757690L;
    private String productName;
    private String customerName;
    private String customerEmail;
    private String reviewProductText;
    private int productIdentify;
    
    public ProductReview(String productName, String customerName, String customerEmail, String reviewProductText) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.reviewProductText = reviewProductText;
        this.productName = productName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;}
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getReviewProductText() {
        return reviewProductText;
    }
    public void setReviewProductText(String reviewProductText) {
        this.reviewProductText = reviewProductText;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int  productId(){
     Random random = new Random();
     this.productIdentify = random.nextInt(100, 9999)+ 1;
     return productIdentify;
    }
}
