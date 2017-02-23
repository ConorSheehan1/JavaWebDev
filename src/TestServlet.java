import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns="/first")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().println("<p>Get request working </p>");

        // pass value to jsp
        req.setAttribute("name", "conor");

        // redirect to jsp
        req.getRequestDispatcher("/WEB-INF/views/first.jsp").forward(req, resp);
    }

}
