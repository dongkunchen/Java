package tw.dongkun.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/RequestDemo8")
public class RequestDemo8 extends HttpServlet {
    //請求轉發測試

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo8被訪問了!");

        //Request共享資源
        req.setAttribute("msg","hello");

        //轉發到Demo9
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/RequestDemo9");
//        requestDispatcher.forward(req,resp);
        req.getRequestDispatcher("/RequestDemo9").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
