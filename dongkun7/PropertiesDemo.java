package dongkun7;

import java.util.Properties;
import java.util.Set;


public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("1001", "zhangsan");
        prop.put("1002", "lisi");
        prop.put("1003", "wangwu");
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
