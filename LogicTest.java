class LogicTest {
	public static void main(String[] args){
		boolean b1 = true;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("我現在在東京");
		}else{
			System.out.println("我現在在南京");
		}
			System.out.println("num1 = " + num1);
			
			
		boolean b2 = true;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("我現在在東京");
		}else{
			System.out.println("我現在在南京");
		}
			System.out.println("num2 = " + num2);
			
		
		boolean b3 = true;
		b3 = false;
		int num3 = 10;
		if(b3 & (num3++ > 0)){
			System.out.println("我現在在東京");
		}else{
			System.out.println("我現在在南京");
		}
			System.out.println("num3 = " + num3);
			
			
		boolean b4 = true;
		b4 = false;
		int num4 = 10;
		if(b4 && (num4++ > 0)){
			System.out.println("我現在在東京");
		}else{
			System.out.println("我現在在南京");
		}
			System.out.println("num4 = " + num4);
		
	}
}
