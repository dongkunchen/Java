public class ConversionDemo{
	public static void main(String[] args){
		double d = 10;
		System.out.println(d);
		
		//小容器轉大容器 自動類型轉換
		byte b = 10;
		short s = b;
		int i = b;
		
		//大轉小 強制類型轉換會造成數據丟失
		int k = (int)88.88;
		System.out.println(k);
	}
}