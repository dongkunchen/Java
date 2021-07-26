package dongkun6;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day01\\fos.txt");
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)(by));
        //結尾 -1
//        int by = fis.read();
//        while (by != -1) {
//            System.out.print((char) by);
//            by = fis.read();
//        }

        //優化
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);
        }

        fis.close();
    }
}
