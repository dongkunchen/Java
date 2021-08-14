package tw.dongkun.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;


/**
 * 監聽器實現
 * 1.註解配置 @WebListener
 * 2.web.xml配置
 *   <listener>
 *      <listener-class>tw.dongkun.listener.ContextLoaderListener</listener-class>
 *   </listener>
 * 註冊監聽
 */

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * 監聽ServletContext對象創建
     * 服務器啟動後自動創建
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //一般用來加載資源文件
        //1.獲取ServletContext對象
        ServletContext servletContext = servletContextEvent.getServletContext();
        //2.加載資源文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        //3.獲取真實路徑
        String realPath = servletContext.getRealPath(contextConfigLocation);
        //4.加載進內存
        try {
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("監聽器被創建了");
    }

    /**
     * 服務器正常關閉後銷毀
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
