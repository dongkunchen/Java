package tw.dongkun.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/cookieDemo3")
public class CookieDemo3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建cookie
        Cookie cookie1 = new Cookie("msg","hello");
        Cookie cookie2 = new Cookie("name", "zhangsan");
        //發送cookie
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
