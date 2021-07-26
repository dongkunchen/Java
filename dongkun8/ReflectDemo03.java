package dongkun8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("dongkun8.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //一般方法會抱錯IllegalAccessException無法訪問private
        //使用暴力反射
        con.setAccessible(true);//設置true會取消訪問檢查

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
