package tw.dongkun.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class FilterDemo4 implements Filter {

    /**
     * 服務器啟動後會創建Filter對象,只執行一次
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init執行了~");
    }


    /**
     * 每次請求就會執行,可執行多次
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter執行了~");
        filterChain.doFilter(servletRequest,servletResponse);

    }


    /**
     * 正常關閉服務器後會執行銷毀
     */
    @Override
    public void destroy() {
        System.out.println("destroy執行了~");
    }
}
