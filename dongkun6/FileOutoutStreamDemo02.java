package dongkun6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutoutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day01\\fos.txt");
        //追加寫入
//        FileOutputStream fos = new FileOutputStream("day01\\fos.txt",true);
//        fos.write(97);
//        byte[] bys = {97,98,99,100,101};
        byte[] bys = "abcde".getBytes();
//        fos.write(bys);
        fos.write(bys,1,3);
        fos.close();
//       換行問題window:\r\n   linux:\n   mac:\r

    }
}
