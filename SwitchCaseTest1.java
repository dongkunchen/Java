import java.util.Scanner;

class SwitchCaseTest1 {
	public static void main(String[] arge) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入你的分數");
		int score = scan.nextInt();
		switch(score / 60){
		case 0:
			System.out.println("不合格");
			break;
		case 1:
		    System.out.println("合格");
		}
	}
}