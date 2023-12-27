
package ladzi.businessLogic;

import model.Product;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
public interface ProductInterface {
    public boolean addProduct(Product product) throws SQLException;
    public boolean updateProductQuantity(Product product, Integer quantity) throws SQLException;
    public boolean deleteProduct(Integer id) throws SQLException;
    public Product getProduct(Integer id) throws SQLException;
    public List<Product> getAllProducts() throws  SQLException;
}
