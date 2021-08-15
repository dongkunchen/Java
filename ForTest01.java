public class ForTest01{
	public static void main(String[] args){
		for(int i = 100; i <= 999; i++){
			int a = i / 100;//百
			int b = (i / 10) % 10;//十
			int c = i % 10;//個
			if(a*a*a + b*b*b + c*c*c == i){
				System.out.println("100~999的水仙花數是 : " + i);
			}
		} 
	}
}