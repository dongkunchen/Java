import java.util.Scanner;//���n�Ĥ@�B

class ScannerTestStr{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);//���n�ĤG�B
		
		System.out.println("�п�J�A���m�W");
		String name = scan.next();//���n�ĤT�B�������m��
		System.out.println(name);
		
		System.out.println("�п�J�A������");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("�п�J�A���魫");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("�A�O�_�ۤ��ڤF�O?(true/false)");
		boolean islove = scan.nextBoolean();
		System.out.println(islove);
		
		//���char���AScanner�S�����Ѭ�����k
		System.out.println("�п�J�A���ʧO:(�k/�k)");
		String gender = scan.next();
		char genderChar = gender.charAt(0);//char ���String����0�Ӧr��
		System.out.println(genderChar);
	}
}