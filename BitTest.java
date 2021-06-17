class BitTest {
	public static void main(String[] args) {
		int i = 21;
		System.out.println("i << 2:" + (i << 2));
		
		int m = 12;
		int n = 5;
		System.out.println("m & n:" + (m & n));
		System.out.println("m | n:" + (m | n));
		System.out.println("m ^ n:" + (m ^ n));
		//交換練習num1 num2交換
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);
		//方式一:常用
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);
		
		//方式二:
		//num1 = num1 ^ num2;
		//num2 = num1 ^ num2;
		//num1 = num1 ^ num2;
		//System.out.println("num1 = " + num1 + ",num2 = " + num2);		
		
	
	}
}