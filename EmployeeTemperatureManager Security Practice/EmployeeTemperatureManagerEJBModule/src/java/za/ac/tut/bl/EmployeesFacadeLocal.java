/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Employees;

/**
 *
 * @author Ladzani_fabian
 */
@Local
public interface EmployeesFacadeLocal {
    List<Employees> findAllWithHighTemperatures();
    
    List<Employees> findAllWithLowTemperatures();
    
    List<Employees> findAllHighInMoreThanOneOcc();

    void create(Employees employees);

    void edit(Employees employees);

    void remove(Employees employees);

    Employees find(Object id);

    List<Employees> findAll();

    List<Employees> findRange(int[] range);

    int count();
    
}
