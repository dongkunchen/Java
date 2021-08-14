package tw.dongkun.jedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import tw.dongkun.jedis.util.JedisPoolUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {

    /**
     * 快速入門jedis
     */
    @Test
    public void test1() {
        //1.獲取連接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作
        jedis.set("username", "zhangsan");
        //3.關閉連接
        jedis.close();
    }

    /**
     * string類型數據
     */
    @Test
    public void test2() {
        //1.獲取連接
        //Jedis jedis = new Jedis("localhost", 6379);
        Jedis jedis = new Jedis();//默認值就是"localhost", 6379
        //2.操作
        jedis.set("username", "zhangsan");
        //3.獲取
        String username = jedis.get("username");
        System.out.println(username);
        //特殊方法setex()存儲可以指定過期時間的key value
        // 存入gender:male  20秒後自動刪除gender:male
        jedis.setex("gender", 20, "male");

        //4.關閉連接
        jedis.close();
    }

    /**
     * hash類型數據
     */
    @Test
    public void test3() {
        //1.獲取連接
        //Jedis jedis = new Jedis("localhost", 6379);
        Jedis jedis = new Jedis();//默認值就是"localhost", 6379
        //2.操作存儲
        jedis.hset("user", "name", "lise");
        jedis.hset("user", "age", "20");//也要寫字符串
        jedis.hset("user", "gender", "male");

        //3.獲取
        String name = jedis.hget("user", "name");
        System.out.println(name);

        //獲取hash所有map數據
        Map<String, String> user = jedis.hgetAll("user");
        //map遍歷
        //a.獲取keyset
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            //b.獲取value
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }

        //4.關閉連接
        jedis.close();
    }

    /**
     * list類型數據
     */
    @Test
    public void test4() {
        //1.獲取連接
        //Jedis jedis = new Jedis("localhost", 6379);
        Jedis jedis = new Jedis();//默認值就是"localhost", 6379
        //2.操作存儲
        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");
        //3.獲取(獲取所有
        List<String> mylist = jedis.lrange("mylist", 0, -1);//0起始索引 -1結尾索引
        System.out.println(mylist);

        //list彈出(刪除)
        String element1 = jedis.lpop("mylist");
        System.out.println(element1);
        String element2 = jedis.rpop("mylist");
        System.out.println(element2);
        List<String> mylist2 = jedis.lrange("mylist", 0, -1);//0起始索引 -1結尾索引
        System.out.println(mylist2);

        //4.關閉連接
        jedis.close();
    }

    /**
     * set類型數據
     */
    @Test
    public void test5() {
        //1.獲取連接
        //Jedis jedis = new Jedis("localhost", 6379);
        Jedis jedis = new Jedis();//默認值就是"localhost", 6379
        //2.操作存儲
       jedis.sadd("myset","java","php","c++");

        //3.獲取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);

        //4.關閉連接
        jedis.close();
    }

    /**
     * sortedset類型數據
     */
    @Test
    public void test6() {
        //1.獲取連接
        //Jedis jedis = new Jedis("localhost", 6379);
        Jedis jedis = new Jedis();//默認值就是"localhost", 6379
        //2.操作存儲
        jedis.zadd("mysortedset",3,"亞瑟");
        jedis.zadd("mysortedset",30,"后羿");
        jedis.zadd("mysortedset",25,"孫悟空");

        //3.獲取
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);

        //4.關閉連接
        jedis.close();
    }

    /**
     * jedis連接池使用
     */
    @Test
    public void test7() {

        //0.創建配置對象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.創建jedis連接池對象
        //無配置默認
        //JedisPool jedisPool = new JedisPool();
        //配置文件
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);

        //2.獲取連接
        Jedis jedis = jedisPool.getResource();

        //3.使用
        jedis.set("hehe","hehe");

        //4.歸還到連接池中
        jedis.close();
    }

    /**
     * jedis連接池工具類使用
     * 版本NoClassDefFoundError抱錯
     */
    @Test
    public void test8() {

        //通過連接池工具類獲取
        Jedis jedis = JedisPoolUtils.getJedis();

        //3.使用
        jedis.set("hello","world");

        //4.歸還到連接池中
        jedis.close();
    }
}
