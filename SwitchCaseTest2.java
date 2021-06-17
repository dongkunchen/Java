import java.util.Scanner;
class SwitchCaseTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2019年月份month:");
		int month = scan.nextInt();
		System.out.println("請輸入2019年的day:");
		int day = scan.nextInt();
		int sumDays = 0;
		/*if太麻煩
		int sumDays = 0;
		if(month == 1){
			sumDays = day;
		}else if(month == 2){
			sumDays = 31 + day;
		}else if(month == 3){
			sumDays = 31 + 28 + day;	
			....
	    */
		switch(month){
		case 12:
			sumDays += 30;	
		case 11:
			sumDays += 31;    
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println("2019年" + month + "月" + day + "日是當年的第" + sumDays + "天");
	}
}