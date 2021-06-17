class ForTest {
	public static void main(String[] arge) {
		for(int i = 1;i <= 5;i++){
			System.out.println("Hello world!");
		}
		
		//練習
		int num = 1;
		for(System.out.print('a');num <= 3;System.out.print('c'),num++){
			System.out.print('b');//輸出abcbcbc
		}
		int sum = 0;
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
			
		}
		System.out.println("總和:" + sum);
		System.out.println("幾個:" + count);
	}
}