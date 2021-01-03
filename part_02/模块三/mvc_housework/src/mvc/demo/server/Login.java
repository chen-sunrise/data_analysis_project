package mvc.demo.server;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Cookie cookie1 = new Cookie("username", username);
        Cookie cookie2 = new Cookie("password", password);

        cookie1.setMaxAge(10*60);
        cookie2.setMaxAge(10*60);

        HttpSession session = req.getSession();
        session.setAttribute("cookieId",username);

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
