import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LogInServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    //post request to handle form submission
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //hard coded validation
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        req.setAttribute("email", email);
        req.setAttribute("password", password);

        if(email.equals("accept@gmail.com")){
            req.getRequestDispatcher("/WEB-INF/views/login-success.jsp").forward(req, resp);
        }
        else {
            req.setAttribute("error", "incorrect email, please try again");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        }
    }
}
