import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(resp.getStatus());
        resp.setStatus(200);
        System.out.println(resp.getCharacterEncoding());
        resp.setHeader("name","java417");
        resp.setHeader("content-type","text/html;charset=UTF-8");
        resp.getWriter().write("There's an error in this page.Must be made by Frontend engineers");
    }
}
