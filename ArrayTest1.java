
//隨機公式 (int)Math.random() * (b - a + 1) + a; 
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random()*90+10);
		}
		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
			
		}
		int maxValue = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("\n最大值: " + maxValue);
		
		int minValue = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值: " + minValue);
		
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
			
		}
		System.out.println("總 和: " + sum);
		
		
		double avgvalue = (double)sum / arr.length;
		System.out.println("平 均: " + avgvalue);
	}

}
