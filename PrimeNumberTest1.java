class PrimeNumberTest1 {
	public static void main(String[] args){
		
		boolean isFlag = true;
		
		long start = System.currentTimeMillis();
		
		for(int i = 2;i <= 100000;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){
				
				if(i % j == 0){
					isFlag = false;
					break;//�u��1
				}
			}
			if(isFlag == true){
				System.out.println(i);
			}
			isFlag = true;
		}
		long end = System.currentTimeMillis();
		System.out.println("�Ҫ�O���ɶ���: " + (end - start));
    }
}