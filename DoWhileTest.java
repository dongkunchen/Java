class DoWhileTest{
	public static void main(String[] args){
		int num = 1;
		int sum = 0;
		int count = 0;
		do{
			
			if(num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}
			
			num++;
		}while(num <= 100);
		
		System.out.println("總和為: " + sum);
		System.out.println("個數為: " + count);
	}
}