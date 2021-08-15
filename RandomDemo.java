import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
		//創建對象
		Random r = new Random();
		//獲取隨機值
		int number = r.nextInt(10);
		System.out.println("number: " + number);
	}
}