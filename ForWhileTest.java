import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int positiveNumber = 0;
		int negativeNumber = 0;
		for(;;){//while(true){
			int number = scan.nextInt();
		    if(number > 0){
				positiveNumber++;
			}else if(number < 0){
				negativeNumber++;
			}else{
				break;
			}
		}
		System.out.println("輸入的正數: " + positiveNumber);
		System.out.println("輸入的負數: " + negativeNumber);
	}
}