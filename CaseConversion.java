//�L�k�sĶ�b��s �w�ѨM�n��ASCII�X
import java.util.Scanner;
class CaseConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�A�n�ഫ���^��p�g:");
		String word = scan.next();
		char word1 = word.charAt(0);
		switch(word1){
			case 97:
			System.out.println("�A�ഫ���^��r���j�g:A");
			break;
		    case 98:
			System.out.println("�A�ഫ���^��r���j�g:B");
			break;
			case 99:
			System.out.println("�A�ഫ���^��r���j�g:C");
			break;
			case 100:
			System.out.println("�A�ഫ���^��r���j�g:D");
			break;
			case 101:
			System.out.println("�A�ഫ���^��r���j�g:E");
			break;
			default:
			System.out.println("other");
		}
	}
}
		