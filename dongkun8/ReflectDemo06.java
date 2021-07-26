package dongkun8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectDemo06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("dongkun8.Student");
//        Method[] methods = c.getMethods();//公共方法包含繼承
        Method[] methods = c.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method);
        }
        System.out.println("----------------");

        Method m = c.getMethod("method1");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        m.invoke(obj);
    }
}
