package mvc.demo.server;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 类型向下转型
        HttpServletRequest request=  (HttpServletRequest) servletRequest;
        HttpServletResponse response =  (HttpServletResponse) servletResponse;

        // 判断用户发出的请求是否是post请求，是，才设置编码
        if(request.getMethod().equalsIgnoreCase("post")){
            request.setCharacterEncoding("UTF-8");
        }

        response.setContentType("text/html;charset=utf-8");

        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
