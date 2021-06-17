
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		Plane plane = new Plane();
		plane.fly();
	
	}

}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1;//前面三個可以省略(public static final)
	
	public abstract void fly();
	
	void stop();//可省略public abstract

	
}

interface Attackable{
	void attack();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("通過引擎飛");
	}

	@Override
	public void stop() {
		System.out.println("駕駛員減速停止");
	}
	
}

abstract class kite implements Flyable{
	
	public void fly() {
		
	}
}


class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}



interface AA{
	void method1();
}
interface BB{
	void method2();
}
interface CC extends AA,BB{
	
}
