
package businessLogic;
import java.sql.SQLException;
import java.util.List;
/*
 * @author Ladzani_fabian
 */
public interface DAOInterface<T> {
    public Boolean add(T t) throws SQLException;
    public Boolean delete(Integer id) throws SQLException;
    public Boolean update(T t) throws SQLException;
    public T get(Integer id) throws SQLException;
    public List<T> getAll() throws SQLException;
    
}
