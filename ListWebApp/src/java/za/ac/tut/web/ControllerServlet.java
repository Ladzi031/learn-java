package za.ac.tut.web;

import jakarta.ejb.EJB;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.ListSBLocal;
import java.util.List;

/**
 * @author Ladzani_fabian
 */
public class ControllerServlet extends HttpServlet {

    @EJB
    private ListSBLocal listService;

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String op = request.getParameter("op");

        String url = "index.html";

        switch (op) {
            case "add":
                String numStr = request.getParameter("num");
                Integer num = Integer.parseInt(numStr);
                listService.add(num);
                request.setAttribute("numStr", num);
                url = "add_outcome.jsp";
                break;
            case "get":
                Integer size = listService.getSize();
                request.setAttribute("size", size);
                url = "get_outcome_size.jsp";
                break;
            case "get_list":
                List<Integer> numbers = listService.getList();
                request.setAttribute("numbers", numbers);
                url = "list_outcome.jsp";
                break;
            default:
                break;
        }
        request.getRequestDispatcher(url).forward(request, response);
    }

}
