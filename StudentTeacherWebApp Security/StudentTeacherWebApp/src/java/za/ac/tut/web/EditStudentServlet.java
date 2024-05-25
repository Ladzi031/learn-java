package za.ac.tut.web;

import java.io.IOException;
import java.util.Objects;
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
public class EditStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal studentService;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long studentNum = Long.parseLong(request.getParameter("id"));
        Integer age = Integer.parseInt(request.getParameter("age"));
        
        String location = "editstudent_outcome.jsp";
        // create student
        Student targetStudent = studentService.find(studentNum);
        
        if(Objects.isNull(targetStudent)) {
           location = "studentnotfound.jsp"; 
        }else {
            targetStudent.setAge(age);
            studentService.edit(targetStudent);
        }
        
        request.getRequestDispatcher(location).forward(request, response);

    }

}
