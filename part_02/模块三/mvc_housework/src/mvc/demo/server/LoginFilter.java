package mvc.demo.server;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 类型向下转型
        HttpServletRequest request=  (HttpServletRequest) servletRequest;
        HttpServletResponse response =  (HttpServletResponse) servletResponse;

        Cookie[] cookies = request.getCookies();
        if (cookies!=null) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            response.sendRedirect("/mvc_housework/login");
        }
    }

    @Override
    public void destroy() {

    }
}
