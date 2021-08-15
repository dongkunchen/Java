public class OperatorTest01{
	public static void main(String[] args){
		int weight1 = 180;
		int weight2 = 200;
		boolean b = weight1 == weight2 ? true : false;
		if(b){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	}
}