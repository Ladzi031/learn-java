package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacade;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 * @author Ladzani_fabian
 */
public class FindStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal studentService;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long studentNum = Long.parseLong(request.getParameter("id"));
        
        Student student = studentService.find(studentNum);
        request.setAttribute("student", student);
        
        request.getRequestDispatcher("student_outcome.jsp").forward(request, response);
    }
}
