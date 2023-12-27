
package za.ac.tut.commonoperations;

import java.util.ArrayList;

/**
 * @author Ladzani_fabian
 * @param <T>
 */
public interface CommonOperations<T> {
    
    public boolean add(T t);
    public T get(T t);
    public ArrayList<T> getAll();
    public boolean delete(T t);
    public boolean update(T t);
}
