package dongkun8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("dongkun8.Student");
        //Constructor<?>[] cons = c.getConstructors();//返回公共構造
        Constructor<?>[] cons = c.getDeclaredConstructors();//私有默認都能拿到
        for(Constructor con : cons){
            System.out.println(con);
        }
        System.out.println("=============");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

    }
}
