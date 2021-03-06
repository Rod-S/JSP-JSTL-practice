import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="AlbumsServlet", urlPatterns = "/albums")
public class AlbumsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Album> albums = DaoFactory.getAlbumsDao().all();
        req.setAttribute("albums", albums);
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
