package dongkun6;

import java.io.*;


public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("day01\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day01\\bos.txt"));
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day01\\bos.txt"));
//        int by;
//        while((by=bis.read())!=-1){
//            System.out.print((char)by);
//        }
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
    }
}
