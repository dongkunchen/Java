package tw.dongkun.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //獲取請求方式
        String method = req.getMethod();
        System.out.println(method);
        //獲取虛擬目錄/request
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //獲取Servlet路徑/RequestDemo1
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //獲取Get方式請求參數:name=zhangsan
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //獲取請求URI
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //獲取URL
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        //獲取版本信息
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //獲取客戶端的ip地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
