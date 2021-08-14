package tw.dongkun.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class FilterDemo3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo3執行了...");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("filterDemo3又回來了...");
    }

    @Override
    public void destroy() {

    }
}
