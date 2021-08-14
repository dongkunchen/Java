package tw.dongkun.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther dongkun-chen
 * 重定向
 */

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Demo1");

        //訪問/responseDemo1會重定向到/responseDemo2
        //方法一
//        //1.設置狀態碼為302
//        resp.setStatus(302);
//        //2.設置響應頭location
//        resp.setHeader("location","/response/responseDemo2");

        //方法二(最常用)//內部實現原理為方法一

//        resp.sendRedirect("/response/responseDemo2");

        //動態獲取虛擬目錄
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/responseDemo2");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
