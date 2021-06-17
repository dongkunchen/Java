class PrimeNumberTest {
	public static void main(String[] args){
		
		boolean isFlag = true;
		
		for(int i = 2;i <= 100;i++,isFlag=true){
			
			for(int j = 2;j < i;j++){
				
				if(i % j == 0){
					isFlag = false;
				}
			}
			if(isFlag == true){
				System.out.println(i);
			}
		}
    }
}