class PrimeNumberTest2 {
	public static void main(String[] args){
		
		int count = 0;
		
		long start = System.currentTimeMillis();
		
		label:for(int i = 2;i <= 100000;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){
				
				if(i % j == 0){
					continue label;
				}
			}
			
			
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("質數的個數為: " + count);
		System.out.println("所花費的時間為: " + (end - start));
    }
}