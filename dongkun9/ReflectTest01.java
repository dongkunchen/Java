package dongkun9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //練習在integer類型ArrayList 透過反射添加"字符串"
        ArrayList<Integer> array = new ArrayList<>();
//        array.add(10);
//        array.add("hello");
        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");

        System.out.println(array);
    }
}
