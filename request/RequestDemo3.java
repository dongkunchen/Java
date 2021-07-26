package tw.dongkun.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String agent = req.getHeader("user-agent");
        System.out.println(agent);
        //判斷瀏覽器版本
        //用contains判斷
        if (agent.contains("Chrome")){
            System.out.println("谷歌來了");
        }else if(agent.contains("Firefox")){
            System.out.println("火狐來了");
        }
    }
}
