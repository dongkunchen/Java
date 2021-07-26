package tw.dongkun.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;



@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //post 獲取請求參數
//        String username = req.getParameter("username");
//        System.out.println("post: " +

        //獲取參數數組
//        String[] hobbies = req.getParameterValues("hobby");
//        for(String hobby:hobbies){
//            System.out.println(hobby);
//        }

        //獲取所有參數
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            String name = parameterNames.nextElement();
//            System.out.println(name);
//            String value = req.getParameter(name);
//            System.out.println(value);
//            System.out.println("-----------");
//        }

        //獲取所有參數map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        //遍歷
        Set<String> keyset = parameterMap.keySet();
        for(String name : keyset){
            //根據name獲取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for(String value : values){
                System.out.println(value);
            }
            System.out.println("-----------");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get 獲取請求參數
//        String username = req.getParameter("username");
//        System.out.println("get: " + username);
        this.doPost(req,resp);//可簡化代碼如果跟post獲得一樣
    }
}
