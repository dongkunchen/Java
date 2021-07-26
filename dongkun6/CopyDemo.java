package dongkun6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyDemo {
    public static void main(String[] args) {

    }

    //jdk9
    private static void method4() throws IOException{
        FileWriter fw = new FileWriter("dyy01\\fr.txt");
        FileReader fr = new FileReader("day01\\fw.txt");
        try (fr;fw) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //jdk 7
    private static void method3() {
        try (FileWriter fw = new FileWriter("dyy01\\fr.txt");
             FileReader fr = new FileReader("day01\\fw.txt");) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("day01\\fr.txt");
            fw = new FileWriter("dyy01\\fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
