package tw.dongkun.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 將JedisPool
 * 抽取成工具類
 * 家載配置文件,配置連接池參數
 * 提供連接的方法
 */
public class JedisPoolUtils {

    private static JedisPool jedisPool;

    static {
        //讀取配置文件
        InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        //創建Properties對象
        Properties pro = new Properties();
        //關聯文件
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //獲取數據,設置道JedisPoolConfig中
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));//獲取是字符串轉int
        config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));//獲取是字符串轉int

        //初始化JedisPool
        jedisPool = new JedisPool(config,pro.getProperty("host"),Integer.parseInt(pro.getProperty("port")));
    }
    /**
     * 獲取連接方法
     */
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
