package tw.dongkun.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         *  b .設置編碼方法一
         * 獲取流之前,設置流編碼ISO-8859-1(流默認編碼)設置為MS950(繁體win10)
         * 獲取流之前,設置流編碼ISO-8859-1(流默認編碼)設置為GBK(簡體win10)
         */
        //resp.setCharacterEncoding("MS950");//必須提前知道編碼
        //設置編碼方法二
        //設置編碼
        //resp.setCharacterEncoding("utf-8");//可省略
        //告訴瀏覽器服務器發送的消息編碼(同時設置流編碼+響應頁面編碼)
        //resp.setHeader("content-type","text/html;charset=utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //1.獲取"字符"輸出
        PrintWriter pw = resp.getWriter();
        //2.輸出數據
//        pw.write("hello response");
//        pw.write("<h1>hello response<h1>");
        //a.中文亂碼問題解決
        pw.write("<h1>你好你好 response<h1>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
