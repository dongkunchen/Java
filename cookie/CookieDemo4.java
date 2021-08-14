package tw.dongkun.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建cookie對象
        Cookie cookie = new Cookie("msg", "setMaxAge");

        //設置存活時間(默認關掉瀏覽器就消失)
        cookie.setMaxAge(30);//持久化保存30秒,30秒後自動刪除cookie文件
        //cookie.setMaxAge(-1);//關掉瀏覽器就消失(默認值)
        //cookie.setMaxAge(0);//直接刪除cookie
        //發送cookie
        resp.addCookie(cookie);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
