import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(req.getMethod());

        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());

        System.out.println(req.getSession());

        System.out.println(req.getHeader("Accept"));

        System.out.println(req.getProtocol());

        System.out.println(req.getScheme());
        System.out.println(req.getSession(true));

        System.out.println("name = " + req.getParameter("name"));
        System.out.println("age = " + req.getParameter("age"));
    }
}
