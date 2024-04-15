package com.practice.web;

import com.practice.domain.Student;
import com.practice.model.StudentInClassSBLocal;
import jakarta.ejb.EJB;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
public class ControllerServlet extends HttpServlet {

    @EJB
    private StudentInClassSBLocal studentService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op = request.getParameter("op");
        String url = "index.html";

        switch (op) {
            case "add_student":
                String name = request.getParameter("name");
                String surname = request.getParameter("surname");
                String studentNumber = request.getParameter("studentNumber");
                Student student = createStudent(name, surname, studentNumber);
                studentService.add(student);
                request.setAttribute("student", student);
                url = "add_student_outcome.jsp"; // todo...
                break;
            case "remove_student":
                String removeStudent = request.getParameter("studentNumber");
                Boolean isRemoved = studentService.remove(removeStudent);
                request.setAttribute("student", removeStudent);
                request.setAttribute("isRemoved", isRemoved);
                url = "remove_student_outcome.jsp";
                break;
            case "update_student":
                String updateStudent = request.getParameter("studentNumber");
                String newSurname = request.getParameter("surname");
                Boolean isUpdated = studentService.update(updateStudent, newSurname);
                request.setAttribute("student", updateStudent);
                request.setAttribute("isUpdated", isUpdated);
                url = "update_student_outcome.jsp";
                break;
            case "get_student":
                String getStudent = request.getParameter("studentNumber");
                Student studentDetails = studentService.getStudent(getStudent);
                request.setAttribute("student", studentDetails);
                url = "view_student_outcome.jsp";
                break;
            case "get_list":
                List<Student> students = studentService.getAllStudent();
                request.setAttribute("classList", students);
                url = "view_list_outcome.jsp";
            default:
                break;
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

    private Student createStudent(String name, String surname, String studentNumber) {
        return new Student(name, surname, studentNumber);
    }

}
