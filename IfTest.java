import java.util.Scanner;
class IfTest {
	public static void main(String[] arge){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�п�J���p�P�������Z:(0-100)");
		int score = scan.nextInt();
		if(score == 100){
			System.out.println("���y�@��BMW");
		}else if(score > 80 && score <=99){
			System.out.println("���y�@�xiphone xs max");
		}else if(score >= 60 && score <=80){
			System.out.println("���y�@�xiPad");
		}else{
			System.out.println("�ƻ򳣨S��");
		}
			
	}
}	