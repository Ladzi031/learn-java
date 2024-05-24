package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.UnitConvertSBLocal;

/**
 * @author Ladzani_fabian
 */
public class MetersToCentimetersServlet extends HttpServlet {
    @EJB
    private UnitConvertSBLocal unitConversionService;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float meters = Float.parseFloat(request.getParameter("meters"));
        Float centis = unitConversionService.toCentis(meters);
        request.setAttribute("meters", meters);
        request.setAttribute("centis", centis);
        request.getRequestDispatcher("centis_outcome.jsp").forward(request, response);
    }

}
