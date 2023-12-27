
package za.ac.tut.bl;
import java.sql.SQLException;
import java.util.List;
/**
 * @author Ladzani_fabian
 * @param <T>
 */
public interface DAOInteface<T> {
    //crud operations
    public boolean add(T t) throws SQLException;
    public boolean delete(Integer id) throws SQLException;
    public boolean update(T t) throws SQLException;
    public T get(Integer id) throws SQLException;
    public List<T> getAll() throws SQLException;
    
    //catering for customised queries - statistics
    public Integer getCnt() throws SQLException;
    public Integer getLowestTestMark() throws SQLException;
    public Integer getHighestTestMark() throws SQLException;
    public Integer getAvgTestMark() throws SQLException;
    public Integer getAvgAge() throws SQLException;
    public Integer getNumPassed() throws SQLException;
    public Integer getNumFailed() throws SQLException;
    public Integer getNumPassed(Character gender) throws SQLException;
    public Integer getNumFailed(Character gender) throws SQLException;
    public List<T> getPassed() throws SQLException;
    public List<T> getFailed() throws SQLException;
    public Integer getTotalNumOfComputingDevices() throws SQLException;
}
