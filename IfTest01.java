import java.util.Scanner;
public class IfTest01{
	public static void main(String[] args){
		//創建對象
		Scanner sc = new Scanner(System.in);
		//接收數據
		System.out.println("請輸入一個整數 : ");
		int x = sc.nextInt();
		if(x%2 == 1){
			System.out.println("輸入的數字 " + x + " 為奇數");
		}else{
			System.out.println("輸入的數字 " + x + " 為偶數");
		}
	}
}