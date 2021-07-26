package dongkun1;

import java.util.Scanner;


public class StringTest {
    public static void main(String[] args) {
        String username = "dongkun";
        String password = "abcde";

        for (int i = 2; i >= 0; i--) {

            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入用戶名 : ");
            String name = sc.nextLine();
            System.out.println("請輸入密碼 : ");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登錄成功");
                break;
            } else {
                if (i > 0) {
                    System.out.println("登陸失敗,你還有 " + i + " 次機會!");
                } else {
                    System.out.println("登錄失敗!");
                }
            }
        }
    }
}
