package dongkun6;

import java.io.*;


public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day01\\osw.txt"));
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day01\\osw.txt"),"GBK");
        osw.write("台灣");
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day01\\osw.txt"));
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("day01\\osw.txt"),"GBK");
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }

        isr.close();
    }
}