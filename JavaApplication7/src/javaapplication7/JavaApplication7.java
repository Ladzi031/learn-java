    //focus your energy on you!!!!!!!
    // look at what is hulisani is doing!!!
    // all of the energy is yours boii... use it wisely to build, yourself
    
package javaapplication7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ladzi.businessLogic.ProductManager;
import model.Product;

/*
 * @author Ladzani_fabian
 */
public class JavaApplication7 {
    public static void main(String[] args) throws SQLException{
        
        final String url = "jdbc:derby://localhost:1527/prodDB";
        final String username = "app";
        final String password = "123";
        
        ProductManager manageProduct = new ProductManager(url, username, password);
        Product product = null;
        Integer productId = null;
        Integer quantity = null;
        List<Product> listOfProducts = new ArrayList<>();
        
        int userChoice = userInput();
        while(userChoice != 6){
             switch (userChoice) {
                case 1:
                    product = createProduct();
                    manageProduct.addProduct(product);
                    System.out.println("==============================product is added!\n");
                break;
                case 2:
                   product = getProductToUpdate();
                    
                   productId = product.getId();
                   quantity = product.getQuantity();
                   
                   manageProduct.updateProductQuantity(product, quantity);
                   
                   System.out.println("================================product is updated!\n");   
                break;
                
                case 3:
                    
                    productId = getProductID();
                    manageProduct.deleteProduct(productId);
                    System.out.println("=================================product is deleted!\n");
                
                break;
                case 4:
                    productId = getProductID();
                   product = manageProduct.getProduct(productId);
                    displayProduct(product);
                break;
                case 5:
                    listOfProducts = manageProduct.getAllProducts();
                    for(Product prod: listOfProducts){
                        
                        System.out.println(prod.toString());
                    }
                    System.out.println("==================================prodcuts have been displayed!  \n");
                break;
                default:
                    System.out.println(userChoice+ " is invalid");
            }
             userChoice = userInput();
        }
        System.out.println("GOODBYE!!!");
    }
   

    private static int userInput() {
        
        Scanner sc = new Scanner(System.in);
        int userChoice;
        
        System.out.println("1 -- Add a product in the database.\n2 -- Update the quantity of a product.\n3 -- Delete a product.\n4 -- Get product information.\n5 -- Get all the products.\n6 -- EXIT THE APPLICATION.\n");
        
        userChoice = sc.nextInt();
        return userChoice;
    }

    private static Product createProduct() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter product id:");
        int id = sc.nextInt();
       
        sc.nextLine();
       
        
        System.out.println("enter product description: ");
        String description = sc.nextLine();
        
        System.out.println("enter unit Price: ");
        double realUnitPrice = Double.parseDouble( sc.next());
        
        System.out.println("enter the quantity: ");
        int quantity = sc.nextInt();
        
        Product product = new Product();
        product.setId(id);
        product.setDescription(description);
        product.setUnitPrice(realUnitPrice);
        product.setQuantity(quantity);
        
        return product;
    }

    private static Product getProductToUpdate() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter product id:");
        int id = sc.nextInt();
        
        System.out.print("enter the quantity: ");
        int quantity = sc.nextInt();
        
        Product product = new Product();
        
        product.setId(id);
        product.setQuantity(quantity);
        
        return product;
    }
    private static Integer getProductID() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the id: ");
        int id = sc.nextInt();
        
        return id;
    }
    private static void displayProduct(Product product) {
        System.out.println(product.toString());
    }
    
}
