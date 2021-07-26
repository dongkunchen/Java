package dongkun7;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day01\\oos.txt"));
        //要序列化要實現Serializable接口 但不需要重寫
        Student s = new Student("林青霞", 30);

        oos.writeObject(s);

        oos.close();
    }
}
