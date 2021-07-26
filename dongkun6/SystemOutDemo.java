package dongkun6;

import java.io.PrintStream;


public class SystemOutDemo {
    public static void main(String[] args) {
//        PrintStream ps = System.out;
//        ps.println("hello");
//        ps.println(100);

        //所以System.out.println就是字節標準輸出流
        System.out.println("hello");
        System.out.println(100);

        System.out.println();
        //print()必須傳參數
        //System.out.print();//抱錯沒有參數不能使用
    }
}
