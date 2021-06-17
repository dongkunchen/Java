import java.util.Scanner;//重要第一步

class ScannerTestStr{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);//重要第二步
		
		System.out.println("請輸入你的姓名");
		String name = scan.next();//重要第三步看類型置換
		System.out.println(name);
		
		System.out.println("請輸入你的芳齡");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("請輸入你的體重");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("你是否相中我了呢?(true/false)");
		boolean islove = scan.nextBoolean();
		System.out.println(islove);
		
		//對於char型態Scanner沒有提供相關方法
		System.out.println("請輸入你的性別:(男/女)");
		String gender = scan.next();
		char genderChar = gender.charAt(0);//char 獲取String的第0個字符
		System.out.println(genderChar);
	}
}