package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.EmployeesFacadeLocal;
import za.ac.tut.entities.Employees;

/**
 * @author Ladzani_fabian
 */
public class ControllerServlet extends HttpServlet {
    @EJB
    private EmployeesFacadeLocal employeeService;
    private List<Employees> employees;
    private String value;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("tempOp");
        
        if(operation.equalsIgnoreCase("high")) {
           employees = employeeService.findAllWithHighTemperatures();
           value = "high";
        }else if(operation.equalsIgnoreCase("low")) {
           employees = employeeService.findAllWithLowTemperatures();
           value = "low";
        }else {
            value = "more than one occasion got high";
            employees = employeeService.findAllHighInMoreThanOneOcc();
        }
        
        request.setAttribute("value", value);
        request.setAttribute("emps", employees);
        request.getRequestDispatcher("employees_outcome.jsp").forward(request, response);
    }
}
