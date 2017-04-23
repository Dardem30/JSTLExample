import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by УВД on 21.04.2017.
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list=UserListSingleTone.getUserList();
        list.add(new User(request.getParameter("login"),request.getParameter("password")));
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("getList.jsp");
        requestDispatcher.forward(request,response);
    }
}
