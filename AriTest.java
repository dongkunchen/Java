class AriTest {
	public static void main(String[] args){
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//氮2
		int result2 = num1 / num2 * num2;
		System.out.println(result2);//氮10 ぃ琌12
		double result3 = num1 / num2;
		System.out.println(result2);//氮2.0
		double result4 = num1 / num2 + 0.0;//2.0
		double result5 = num1 / (num2 + 0.0);//2.4
		double result6 = (double)num1 / num2;//2.4
		double result7 = (double)(num1 / num2);//2.0
		
		int m1 = 12;//砆家计
		int n1 = 5;//家计
		System.out.println("m1 % n1 = " + m1 % n1); 
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2); 
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3); 
		
		int m4 = -12;//挡狦蛤砆家计才腹妓 璽碞璽 タ碞タ
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4); 
		//***************************************
		
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);
		
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);
		

		int a4 = 10;
		int b4 = --a4;
		System.out.println("a4 = " + a4 + ",b4 = " + b4);
		
		int a5 = 10;
		int b5 = a5--;
		System.out.println("a5 = " + a5 + ",b5 = " + b5);
		
		
		
	}
}