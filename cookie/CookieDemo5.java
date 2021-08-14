package tw.dongkun.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie中文
 * tomcat8之後可以直接使用,8之前要編成URL碼
 */

@WebServlet("/cookieDemo5")
public class CookieDemo5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建cookie對象
        Cookie cookie = new Cookie("msg", "你好");

        //設置訪問cookie範圍(同tomcat服務器)
        //cookie.setPath("/cookie");//當前
        //cookie.setPath("/");//所有

        //不同tomcat服務器111.goggle.com 222.goggle.com可共享cookie
        //cookie.setDomain(".goggle.com");//要一級域名相同後面XXX.XXX相同


        //響應cookie到客戶端
        resp.addCookie(cookie);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
