package dongkun8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("dongkun8.Student");
        //Field[] fields = c.getFields();//獲取公共
        Field[] fields = c.getDeclaredFields();//獲取私有 默認
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("--------------");

        Field addressField = c.getField("address");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        addressField.set(obj,"西安");//給obj的成員變量addressField賦值為西安
        System.out.println(obj);
    }
}
