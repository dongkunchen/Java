
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
	
	    System.out.println(Arrays.toString(arr1));
	    
	    Arrays.fill(arr1, 10);
	    System.out.println(Arrays.toString(arr1));
	    
	    Arrays.sort(arr2);
	    System.out.println(Arrays.toString(arr2));
	    
	    int[] arr3 = new int[]{-98,-34,2,34,56,66,79,105,210,333};
	    int index = Arrays.binarySearch(arr3, 56);
	    System.out.println(index);
	}
}
