package tw.dongkun.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet({"/ddd","/aaa","/ccc"})
//@WebServlet({"/ddd/aaa","/ccc"})
@WebServlet({"/ddd/*","/ccc"})
//@WebServlet("*.do")//訪問用xxx.do
public class HttpServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello doGet");
    }
}
