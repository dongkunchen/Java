package tw.dongkun.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 攔截方式註解配置(五個參數)
 * 可以配置多個
 * 1.DispatcherType.REQUEST 直接請求才會被執行過濾(默認)
 * 2.DispatcherType.FORWARD 只有轉發訪問才會被執行過濾
 *
 * web.xml標籤
 * <dispatcher></dispatcher>也可設置
 */

//@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
@WebFilter(value = "/index.jsp", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class FilterDemo6 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo6被執行~");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
