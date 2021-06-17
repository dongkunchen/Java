
public class ArrayTest {
	
	public static void main(String[] args) {
		
		int num;
		num =10;
		int id = 1001;
		//靜態初始化:
		int[] ids;
		ids = new int[] {1001,1002,1003,1004};
		//動態初始化:
		String[] names = new String[5];
		names[0] = "王小明";
		names[1] = "王小華";
		names[2] = "王小利";
		names[3] = "王小龍";
		names[4] = "王小虎";
		
		System.out.println(names.length);
		System.out.println(ids.length);
		
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
}
