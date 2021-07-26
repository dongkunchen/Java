package dongkun8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("dongkun8.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);//取消訪問檢查
        nameField.set(obj,"林青霞");//私有不能值些訪問IllegalAccessException
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,30);
        System.out.println(obj);

        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj,"香港");
        System.out.println(obj);
    }
}
