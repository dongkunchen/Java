import java.util.Scanner;

class SwitchCaseTest1 {
	public static void main(String[] arge) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�A������");
		int score = scan.nextInt();
		switch(score / 60){
		case 0:
			System.out.println("���X��");
			break;
		case 1:
		    System.out.println("�X��");
		}
	}
}