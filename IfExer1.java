import java.util.Scanner;

class IfExer1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�п�J�A������:(cm)");
		int height = scan.nextInt();
		System.out.println("�п�J�A���]�I:(�d�U)");
		double wealth = scan.nextDouble();
		System.out.println("�A��J�A�O�_��:(true/false)");
		boolean isHandsome = scan.nextBoolean();
		
		if(height >= 180 && wealth >= 1 && isHandsome){
			System.out.println("�ڤ@�w�n�����L");
		}else if(height >= 180 || wealth >= 1 || isHandsome){
			System.out.println("��W������U���l");
		}else{
			System.out.println("����!");
		}
	}
}

		
		