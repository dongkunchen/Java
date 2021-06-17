
public class SubClassTest {
	
	public static void main(String[] args) {
		SubClass s = new SubClass();
		
		//靜態方法只能通過街口來調用
		CompareA.method1();
		
		//默認方法要通過對象調用
		//如果實現類重寫了街口中的默認方法調用是重寫的方法
		s.method2();
		//如果子類或實現類繼承的父類和街口聲明同名同參方法
		//那麼子類沒有重寫此方法情況下,默認調用父類方法===類優先原則
		//如果實現類實現了多個街口定義了同名同參默認方法
		//那麼在實現類沒有重寫的情況下,抱錯-->街口衝突
		//這就需要必須實現類從寫此方法
		s.method3();
		s.myMethod();
	}

}

class SubClass extends SuperClass implements CompareA,CompareB{
	
	public void method2() {
		System.out.println("SubClass:南京");
	}
	public void method3() {
		System.out.println("SubClass:沖繩");
	}
	public void myMethod() {
		method3();//調用重寫的
		super.method3();//調用父類的
		CompareA.super.method3();//調用街口A
		CompareB.super.method3();//調用街口B
		
		
	}
	
}
