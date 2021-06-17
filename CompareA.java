
public interface CompareA {
	
	public static void method1() {
		System.out.println("CompareA:東京");
	}

	public default void method2() {
		System.out.println("CompareA:南京");
	}
	
	default void method3() {
		System.out.println("CompareA:南京");
	}
	
	
}
