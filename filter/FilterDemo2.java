package tw.dongkun.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 過濾器使用
 * 2.web.xml配置
 */
public class FilterDemo2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo2被執行了!");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
