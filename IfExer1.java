import java.util.Scanner;

class IfExer1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入你的身高:(cm)");
		int height = scan.nextInt();
		System.out.println("請輸入你的財富:(千萬)");
		double wealth = scan.nextDouble();
		System.out.println("你輸入你是否帥:(true/false)");
		boolean isHandsome = scan.nextBoolean();
		
		if(height >= 180 && wealth >= 1 && isHandsome){
			System.out.println("我一定要嫁給他");
		}else if(height >= 180 || wealth >= 1 || isHandsome){
			System.out.println("比上不足比下有餘");
		}else{
			System.out.println("不嫁!");
		}
	}
}

		
		