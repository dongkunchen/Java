import java.util.Scanner;
class IfTest2 {
	public static void main(String[] arge) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入第一個整數");
		int num1= scan.nextInt();
		System.out.println("請輸入第二個整數");
		int num2 = scan.nextInt();
		System.out.println("請輸入第三個整數");
		int num3 = scan.nextInt();
		if(num1 >= num2){
			if(num3 >= num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else if(num3 <= num2){
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else{
			if(num3 >= num1){
				System.out.println(num1 + "," + num2 + "," + num3);
			}else if(num3 <= num1){
				System.out.println(num3 + "," + num1 + "," + num2);
			}else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}
	}
}	