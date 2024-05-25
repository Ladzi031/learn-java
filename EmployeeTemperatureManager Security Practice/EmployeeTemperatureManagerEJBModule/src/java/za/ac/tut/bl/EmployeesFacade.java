/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import za.ac.tut.entities.Employees;

/**
 *
 * @author Ladzani_fabian
 */
@Stateless
public class EmployeesFacade extends AbstractFacade<Employees> implements EmployeesFacadeLocal {
    @PersistenceContext(unitName = "EmployeeTemperatureManagerEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeesFacade() {
        super(Employees.class);
    }

    @Override
    public List<Employees> findAllWithHighTemperatures() {
        TypedQuery<Employees> q = em.createQuery("SELECT e FROM Employees e WHERE e.temperature > 38.0", Employees.class);
        List<Employees> result = (List<Employees>) q.getResultList();
        return result;
    } 

    @Override
    public List<Employees> findAllWithLowTemperatures() {
      TypedQuery<Employees> q = em.createQuery("SELECT e FROM Employees e WHERE e.temperature <= 38.0", Employees.class);
      List<Employees> result = (List<Employees>) q.getResultList();
      return result;
    }

    @Override
    public List<Employees> findAllHighInMoreThanOneOcc() {
      TypedQuery<Employees> q = em.createQuery(
              "SELECT e FROM Employees e WHERE e.name IN (SELECT e.name FROM Employees e WHERE e.temperature > 38.0 GROUP BY e.name HAVING COUNT(e.name) > 1)",
              Employees.class);
      List<Employees> result = (List<Employees>) q.getResultList();
      return result;
    }

    @Override
    public int count() {
        return super.count(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employees> findRange(int[] range) {
        return super.findRange(range); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employees> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employees find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Employees entity) {
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Employees entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Employees entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
