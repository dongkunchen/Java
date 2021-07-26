package dongkun6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        /*InputStream is = System.in;
        //字節流轉換成字符流(為了讀取中文)
        InputStreamReader isr = new InputStreamReader(is);
        //為了讀取一行(一行特有方法在buffer)
        BufferedReader br = new BufferedReader(isr);*/
        //三合一
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入字符串 : ");
        String line = br.readLine();
        System.out.println("你輸入的字符串 : " + line);

        System.out.println("請輸入一個整數 : ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你輸入的整數 : " + i);

        //JAVA有提供Scanner 包裝上述方法
        Scanner sc = new Scanner(System.in);
    }
}
