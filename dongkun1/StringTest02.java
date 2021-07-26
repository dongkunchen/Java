package dongkun1;
import java.util.Scanner;


public class StringTest02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字符串 : ");
        String line = sc.nextLine();

        String s = reverse(line);
        System.out.println("反轉後 : " + s);
    }

    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}
