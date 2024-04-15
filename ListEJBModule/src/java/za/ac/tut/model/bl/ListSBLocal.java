
package za.ac.tut.model.bl;

import jakarta.ejb.Local;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
@Local
public interface ListSBLocal {
    public void add(Integer num);
    
    public Integer getSize();
    
    public List<Integer> getList();
}
