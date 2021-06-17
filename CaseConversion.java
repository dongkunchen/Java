//無法編譯在研究 已解決要轉ASCII碼
import java.util.Scanner;
class CaseConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入你要轉換的英文小寫:");
		String word = scan.next();
		char word1 = word.charAt(0);
		switch(word1){
			case 97:
			System.out.println("你轉換的英文字母大寫:A");
			break;
		    case 98:
			System.out.println("你轉換的英文字母大寫:B");
			break;
			case 99:
			System.out.println("你轉換的英文字母大寫:C");
			break;
			case 100:
			System.out.println("你轉換的英文字母大寫:D");
			break;
			case 101:
			System.out.println("你轉換的英文字母大寫:E");
			break;
			default:
			System.out.println("other");
		}
	}
}
		