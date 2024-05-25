package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
public class AddStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal studentService;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long studentNum = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        
        Student student = createStudent(studentNum, name, age);
        studentService.create(student);
       
        request.getRequestDispatcher("addstudent_outcome.jsp").forward(request, response);
    }

    private Student createStudent(Long studentNum, String name, Integer age) {
        return new Student(studentNum, name, age, new Date());
    }

}
