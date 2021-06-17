class IfTest {
	public static void main(String[] arge) {
		//舉例1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("需要進一步檢查");
		}
		System.out.println("檢查結束");
		
		//舉例2
		
		int age = 23;
		if(age < 18){
			System.out.println("你還可以看動畫片");
		}else{
			System.out.println("你可以看成人電影");
		}
		//舉例3
		if(age < 0){
			System.out.println("你輸入的數據錯誤");
		}else if(age < 18){
			System.out.println("青少年時期");
		}else if(age < 35){
			System.out.println("青壯年時期");
		}else if(age < 60){
			System.out.println("中年時期");
		}else if(age < 120){
			System.out.println("老年時期");
		}else{
			System.out.println("你成仙了");
		}
	}
}