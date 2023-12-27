
package ladzi.businessLogic;

import java.sql.SQLException;
import java.util.List;
import model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
 * @author Ladzani_fabian
 */
public class ProductManager implements ProductInterface {
   private Connection connection;

    public ProductManager(String url, String username, String password) throws SQLException{
        this.connection = createConnectionWithDB(url, username, password);
    }
    
    @Override
    public boolean addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO PRODTBL(ID, DESCRIPTION, UNITPRICE, QUANTITY, TIMESTAMP) VALUES(?,?,?,?,?)";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        
        prepStatement.setInt(1, product.getId());
        prepStatement.setString(2, product.getDescription());
        prepStatement.setDouble(3, product.getUnitPrice());
        prepStatement.setInt(4, product.getQuantity());
        prepStatement.setTimestamp(5, Timestamp.from(Instant.now()));
        
        prepStatement.executeUpdate();
        
        prepStatement.close();
        
        return true;
    }

    @Override
    public boolean updateProductQuantity(Product product, Integer quantity) throws SQLException {
        String sql = "UPDATE PRODTBL SET QUANTITY=? WHERE ID=?";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        
        prepStatement.setInt(1, quantity);
        prepStatement.setInt(2, product.getId());
        
        prepStatement.executeUpdate();
        prepStatement.close();
        
        return true;
    }

    @Override
    public boolean deleteProduct(Integer id) throws SQLException {
        String sql = "DELETE FROM PRODTBL WHERE ID=?";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        
        prepStatement.setInt(1, id);
        
        prepStatement.executeUpdate();
        prepStatement.close();
        
        return true;
    }

    @Override
    public Product getProduct(Integer id) throws SQLException {
        final String sql = "SELECT * FROM PRODTBL WHERE ID=?";
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        
        prepStatement.setInt(1, id);
        
        ResultSet resultSet = prepStatement.executeQuery();
        if(resultSet.next()){
            
            Integer idNo = resultSet.getInt("ID");
            String description = resultSet.getString("DESCRIPTION");
            Double unitPrice = resultSet.getDouble("UNITPRICE");
            Integer quantity = resultSet.getInt("QUANTITY");
            Timestamp timestamp = resultSet.getTimestamp("TIMESTAMP");
            
            Product product = new Product(idNo, description, unitPrice, quantity, timestamp);
            
            prepStatement.close();
            
            return product;
            
        }else {
            
            prepStatement.close();
            return null;
        }
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        final String sql = "SELECT * FROM PRODTBL";
        final List<Product> listOfProducts = new ArrayList<>();
        
        PreparedStatement prepStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = prepStatement.executeQuery();
        
        while(resultSet.next()){
            
            Integer idNo = resultSet.getInt("ID");
            String description = resultSet.getString("DESCRIPTION");
            Double unitPrice = resultSet.getDouble("UNITPRICE");
            Integer quantity = resultSet.getInt("QUANTITY");
            Timestamp timestamp = resultSet.getTimestamp("TIMESTAMP");
            
            Product product = new Product(idNo, description, unitPrice, quantity, timestamp);
            
            listOfProducts.add(product);
            
        }
        prepStatement.close();
        
        return listOfProducts;
    }

    private Connection createConnectionWithDB(String url, String username, String password) throws  SQLException{
        
        return DriverManager.getConnection(url, username, password);
    }
    
}
