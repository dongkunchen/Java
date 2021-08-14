package tw.dongkun.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 訪問案例
 */

@WebServlet("/cookieAccess")
public class CookieAccess extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置編碼格式
        resp.setContentType("text/html;charset=utf-8");

        //1.獲取所有cookie
        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        //2.變歷所有cookie
        if(cookies !=null && cookies.length>0){
            for(Cookie cookie:cookies){
                //3.獲取cookie的名稱
                String name = cookie.getName();
                //4.判斷名稱是否是:lastTime
                if("lastTime".equals(name)){
                    //不是第一次訪問
                    flag = true;
                    //設置value存入新時間
                    //獲取當前時間
                    Date date = new Date();
                    //cookie不支持存空格特殊符號
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    //使用URL編碼再存入cookie
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    cookie.setValue(str_date);
                    //設置cookie存活時間
                    cookie.setMaxAge(60*60*24*30);//一個月
                    //響應回客戶端添加cookie
                    resp.addCookie(cookie);

                    //響應數據
                    //獲取cookie的value時間
                    String value = cookie.getValue();
                    //URL解碼
                    value = URLDecoder.decode(value,"utf-8");
                    resp.getWriter().write("<h1>歡迎回來,您上次訪問時間為:"+value+"</h1>");

                    break;
                }
            }
        }
        if(cookies==null||cookies.length==0||flag==false){
            //沒有第一次訪問

            //設置value存入新時間
            //獲取當前時間
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            //使用URL編碼再存入cookie
            str_date = URLEncoder.encode(str_date, "utf-8");
            Cookie cookie = new Cookie("lastTime", str_date);
            //設置cookie存活時間
            cookie.setMaxAge(60*60*24*30);//一個月
            //響應回客戶端添加cookie
            resp.addCookie(cookie);

            resp.getWriter().write("<h1>您好!歡迎您首次訪問</h1>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
