import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by УВД on 21.04.2017.
 */
@WebServlet(name = "ServletCat")
public class ServletCat extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cat> list=CatListSingleTone.getList();
        try {
            if (request.getParameter("black").equals("on") && (request.getParameter("wool").equals("short"))) {
                list.add(new Cat(request.getParameter("login"), request.getParameter("password")));
                request.setAttribute("list", list);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("getListCat.jsp");
                requestDispatcher.forward(request, response);
            }else {
                RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("index.jsp");
                requestDispatcher2.forward(request, response);
            }
        }catch (NullPointerException e){

        }
    }
}
