import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�п�J�����~�֬O�h��");
		
		int dogAge = scan.nextInt();
		
		if (dogAge >= 0 && dogAge <= 2){
			System.out.println("�۷��H�~�֬O" + dogAge * 10.5 + "��");
		}else if (dogAge > 2){
		    System.out.println("�۷��H�~�֬O" + (2 * 10.5 + (dogAge -2) * 4));
		}else{
			System.out.println("���٨S�X�ͩO");
			
		int value = (int)(Math.random() * 90 + 10);
		//��10-99, ����(int)(Math.random() * (99�᭱-10�e��+1) + 10�e��)
		System.out.println(value);
		//
		}
    }
}
		