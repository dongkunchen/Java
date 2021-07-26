package dongkun6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day01\\fos.txt");
    fos.write(97);
    fos.close();
    }
}
