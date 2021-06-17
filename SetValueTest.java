class SetValueTest {
	public static void main(String[] args) {
		int i1 = 10;
		int j1 = 10;
		int i2,j2;
		i2 = j2 = 10;
		int i3 = 10,j3 = 20;
		System.out.println(j3);
		
		//*******************************
		int num1 = 10;
		num1 += 2;//num1 = num1 + 2;
		System.out.println(num1);
		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5;
		System.out.println(num2);
		//½m²ß1
		int i = 1;
		i *= 0.1;
		System.out.println(i);
		i++;
		System.out.println(i);
		//½m²ß2
		int n = 3;
		int m = 2;
		n *= m++;// n = n * m++;
		System.out.println("m=" + m);//3
		System.out.println("n=" + n);//6
		
	}
}
