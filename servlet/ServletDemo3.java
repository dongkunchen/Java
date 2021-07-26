package tw.dongkun.servlet;

import javax.servlet.*;
import java.io.IOException;


public class ServletDemo3 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("創建時被執行而且只執行一次");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("每次訪問就執行");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("被正常關閉的時候被執行只執行一次");
    }
}
