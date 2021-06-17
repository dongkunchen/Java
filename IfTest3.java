import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入狗的年齡是多少");
		
		int dogAge = scan.nextInt();
		
		if (dogAge >= 0 && dogAge <= 2){
			System.out.println("相當於人年齡是" + dogAge * 10.5 + "歲");
		}else if (dogAge > 2){
		    System.out.println("相當於人年齡是" + (2 * 10.5 + (dogAge -2) * 4));
		}else{
			System.out.println("狗還沒出生呢");
			
		int value = (int)(Math.random() * 90 + 10);
		//取10-99, 公式(int)(Math.random() * (99後面-10前面+1) + 10前面)
		System.out.println(value);
		//
		}
    }
}
		