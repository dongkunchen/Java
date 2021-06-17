import java.util.Scanner;
class IfTest {
	public static void main(String[] arge){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入岳小鵬期末成績:(0-100)");
		int score = scan.nextInt();
		if(score == 100){
			System.out.println("獎勵一輛BMW");
		}else if(score > 80 && score <=99){
			System.out.println("獎勵一台iphone xs max");
		}else if(score >= 60 && score <=80){
			System.out.println("獎勵一台iPad");
		}else{
			System.out.println("甚麼都沒有");
		}
			
	}
}	