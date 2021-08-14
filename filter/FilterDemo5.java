package tw.dongkun.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 攔截特定頁面資源路徑
//@WebFilter("/index.jsp")
// 攔截目錄可配合servlet 加上pre目錄user使用
//@WebFilter("/user/*")
// 後綴名攔截
@WebFilter("*.jsp")
public class FilterDemo5 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("過濾器被執行了!");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
