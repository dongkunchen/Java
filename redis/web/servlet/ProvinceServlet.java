package tw.dongkun.web.servlet;


import com.fasterxml.jackson.databind.ObjectMapper;
import tw.dongkun.domin.Province;
import tw.dongkun.service.ProvinceService;
import tw.dongkun.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.調用service查詢
        ProvinceService service = new ProvinceServiceImpl();
        List<Province> list = service.findAll();
        //2.序列化list為json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        //System.out.println(json);//測試數據
        //3.響應結果
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
