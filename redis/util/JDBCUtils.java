package tw.dongkun.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具類 使用Durid連接池
 */
public class JDBCUtils {
    /**
     * 1.定義成員變量DataSource
     */
    private static DataSource ds;

    /**
     * 4.使用靜態代碼塊
     */
    static {
        try {
            //a.加載配置文件
            Properties pro = new Properties();
            //利用類.class使用ClassLoader加載配置文件獲取輸入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);

            //b.初始化連接池對象
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 3.獲取連接池對象
     * 工具類通常都靜態
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * 2.獲取連接Connection對象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
