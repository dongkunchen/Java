import java.util.Scanner;
public class ScannerTest{
	public static void main(String[] args){
		//創建對象
		Scanner sc = new Scanner(System.in);
		//接收數據
		System.out.println("請輸入第一個和尚身高 : ");
		int height1 = sc.nextInt();
		System.out.println("請輸入第二個和尚身高 : ");
		int height2 = sc.nextInt();
		System.out.println("請輸入第三個和尚身高 : ");
		int height3 = sc.nextInt();
		
		//比較大小
		int MaxHeight = (height1 > height2 ? height1 : height2) > height3 
						? (height1 > height2 ? height1 : height2) : height3;
		System.out.println("maxHeight : " + MaxHeight);
	}
}