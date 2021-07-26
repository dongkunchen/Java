package dongkun6;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class StringDemo {
    public static void main(String[] args){
        String s = "台灣";
//    byte[] bys = s.getBytes(StandardCharsets.UTF_8);
        //編碼
        byte[] bys = s.getBytes();
        //byte[] bys = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(Arrays.toString(bys));//[-27, -113, -80, -25, -127, -93]

        //解碼
        String ss = new String(bys);
        System.out.println(ss);
    }
}
