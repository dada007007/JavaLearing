import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("name是： " + req.getParameter("name"));
        System.out.println("age是： " + req.getParameter("age"));
        System.out.println("URL是： " + req.getRequestURL());
        System.out.println("URI是： " + req.getRequestURI());
        System.out.println("User-Agent是： " + req.getHeader("User-Agent"));
        System.out.println("协议是： " + req.getSession());
        System.out.println("请求方式是： " + req.getMethod());
        resp.getWriter().write("Hello Tom");
    }
}
