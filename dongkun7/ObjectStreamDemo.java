package dongkun7;

import java.io.*;


public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
//        write();
        read();
    }

    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day01\\oos.txt"));
        Student s = new Student("林青霞", 30);
        oos.writeObject(s);
        oos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day01\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }

}
