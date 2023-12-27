
package za.ac.tut.customermanager;

import java.util.ArrayList;
import za.ac.tut.commonoperations.CommonOperations;
import za.ac.tut.entities.Customer;

/**
 * @author Ladzani_fabian
 */
public class CustomerManager implements CommonOperations<Customer>{
    ArrayList<Customer> customerDatabase;

    public CustomerManager() {
        customerDatabase = new ArrayList<>();
    }
    
    @Override
    public boolean add(Customer t) {
        customerDatabase.add(t);
        return true;
    }

    @Override
    public Customer get(Customer t){
        if(customerDatabase.contains(t)){
            return customerDatabase.get(customerDatabase.indexOf(t));
        }else {
            return null;
        }
    }

    @Override
    public ArrayList<Customer> getAll() {
        return customerDatabase.isEmpty() ? null : customerDatabase;
    }

    @Override
    public boolean delete(Customer t) {
        return customerDatabase.remove(t);
    }

    @Override
    public boolean update(Customer t) {
        
        if(customerDatabase.contains(t)){
           int index =  customerDatabase.indexOf(t);
           customerDatabase.set(index, t); // imagine some updating process going on here
           return true;
        }else {
            return false;
        }
    }
    
}
