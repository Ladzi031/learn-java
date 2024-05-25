/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Student;

/**
 *
 * @author Ladzani_fabian
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {
    
    @PersistenceContext(unitName = "ClassListManagerEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }
    
    @Override
    public int count() {
        return super.count(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> findRange(int[] range) {
        return super.findRange(range); //To change body of generated methods, choose Tools | Templates.
    }
    
    @RolesAllowed({"teacher","student"})
    @Override
    public List<Student> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    @RolesAllowed("teacher")
    @Override
    public Student find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }
    @RolesAllowed("teacher")
    @Override
    public void remove(Student entity) {
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }
    @RolesAllowed("teacher")
    @Override
    public void edit(Student entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    @RolesAllowed("teacher")
    @Override
    public void create(Student entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
