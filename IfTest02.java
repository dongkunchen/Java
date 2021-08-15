import java.util.Scanner;
public class IfTest02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("請輸入小明的成績 : ");
			int score = sc.nextInt();
			if(score > 100 || score <0){
				System.out.println("你輸入的數據錯誤!");
			}else if(score <= 100 && score >= 95){
				System.out.println("獎勵腳踏車一輛");
			}else if(score < 95 && score >= 90){
				System.out.println("獎勵遊樂園旅遊");
			}else if(score < 90 && score >= 80){
				System.out.println("獎勵變形金剛玩具");
			}else{
				System.out.println("痛揍一頓");
			}
		}while(true);
	}
}