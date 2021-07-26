package tw.dongkun.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/RequestDemo4")
public class RequestDemo4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String referer = req.getHeader("referer");
        System.out.println(referer);

        //防盜鏈
        if(referer!=null){
            if(referer.contains("/request")){
                //正常訪問--顯示在控制台
//                System.out.println("播放電影");
                //正常訪問--響應回頁面
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("播放電影");
            }else{
                //盜鏈--顯示在控制台
//                System.out.println("想看電影嗎來youtube");
                //盜鏈--響應回頁面
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("想看電影嗎來youtube");
            }
        }
    }
}
