package dongkun6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("1001", "zhangsan");
        map.put("1002", "lisi");
        map.put("1003", "wangwu");
        map.put("1001", "zhaoliu");

        System.out.println(map);
//
//        Set<String> keySet = map.keySet();
//        for (String key : keySet) {
//            String value = map.get(key);
//            System.out.println(key + "," + value);
//        }
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
