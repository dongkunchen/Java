public class WhileTest{
	public static void main(String[] args){
		int count = 0;
		int zf = 8844430;
		double paper = 0.1;
		while(paper <= zf){
			paper *= 2;
			count ++;
		}
		System.out.println("一張紙要折疊 " + count + " 能達到珠峰高度!");
	}
}