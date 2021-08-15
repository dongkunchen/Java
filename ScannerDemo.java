import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		//創建對象
		Scanner sc = new Scanner(System.in);
		//接收數據
		int x = sc.nextInt();
		//輸出數據
		System.out.println("x : " + x);
	}
}