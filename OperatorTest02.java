public class OperatorTest02{
	public static void main(String[] args){
		int height1 = 150;
		int height2 = 210;
		int height3 = 165;
		int MaxHeight = (height1 > height2 ? height1 : height2) > 
		height3 ? (height1 > height2 ? height1 : height2) : height3;
		System.out.println(MaxHeight);
	}
}