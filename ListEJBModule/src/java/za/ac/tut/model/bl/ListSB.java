
package za.ac.tut.model.bl;

import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
@Stateful
public class ListSB implements ListSBLocal {

    private final List<Integer> numbers = new ArrayList<>();

    @Override
    public void add(Integer num) {
        numbers.add(num);
    }

    @Override
    public Integer getSize() {
        return numbers.size();
    }

    @Override
    public List<Integer> getList() {
        return numbers;
    }
}
