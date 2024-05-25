package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 * @author Ladzani_fabian
 */
public class GetAllStudentsServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal studentService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Student> students = studentService.findAll();
        request.setAttribute("students", students);
        
        request.getRequestDispatcher("getallstudents_outcome.jsp").forward(request, response);
    }
}
