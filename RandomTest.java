import java.util.Random;
import java.util.Scanner;
public class RandomTest{
	public static void main(String[] args){
		Random r = new Random();
		int number = r.nextInt(100) + 1;//1~100
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入你要猜的數字 : ");
			int guessNumber = sc.nextInt();
			
			if(guessNumber > number){
				System.out.println("你猜的數字 " + guessNumber + " 大了");
			}else if(guessNumber < number){
				System.out.println("你猜的數字 " + guessNumber + " 小了");
			}else{
				System.out.println("你猜中了!");
				break;
			}
		}
	}
}