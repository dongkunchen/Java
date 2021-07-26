package dongkun7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
//        myStore();
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("day01\\fw.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.put("1001", "zhangsan");
        prop.put("1002", "lisi");
        prop.put("1003", "wangwu");

        FileWriter fw = new FileWriter("day01\\fw.txt");
        prop.store(fw, null);
        fw.close();
    }
}
