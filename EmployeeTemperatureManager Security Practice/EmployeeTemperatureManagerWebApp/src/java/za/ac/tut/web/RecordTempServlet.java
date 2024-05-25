package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.EmployeesFacadeLocal;
import za.ac.tut.entities.Employees;

/**
 *
 * @author Ladzani_fabian
 */
public class RecordTempServlet extends HttpServlet {
    
    @EJB
    private EmployeesFacadeLocal employeeService;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Long id = Long.parseLong(request.getParameter("id"));
        Double temp = Double.parseDouble(request.getParameter("temp"));
        
       Employees employee = createEmployee(name, id, temp);
       
       employeeService.create(employee);
       request.getRequestDispatcher("record_outcome.jsp").forward(request, response);
    }

    private Employees createEmployee(String name, Long id, Double temp) {
      return new Employees(id, name, temp, new Date());
    }

}
