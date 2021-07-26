package dongkun6;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo03 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos=new FileOutputStream("day01\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos !=null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
