package dongkun9;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Student s = new Student();
//        s.study();

//        Teacher t = new Teacher();
//        t.teach();
        /*
        * 配置文件
        * class.txt
        * className=dongkun9.Student
        * methodNane=study
        */

        //加載數據
        Properties prop = new Properties();
        FileReader fr = new FileReader("day01\\class.txt");
        prop.load(fr);
        fr.close();

        //讀取數據
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通過反射來使用
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
