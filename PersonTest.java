
public class PersonTest {
	public static void main(String[] args) {
		
		method(new Student());//匿名對象
		
		Worker worker = new Worker();
		method1(worker);//非匿名的類非匿名的對象
		
		method1(new Worker());//非匿名的類匿名的對象
		
		System.out.println("****************");
	   
		
		Person p = new Person() {
			public void eat() {
				System.out.println("吃東西");
			}
			public void breath() {
				System.out.println("好好呼吸");
				
			}
		};
		method1(p);
		
		
	}
	
	public static void method1(Person p) {
		p.eat();
		p.breath();
	}
	
	public static void method(Student s) {
		
	}
}
	
class Worker extends Person{
	
	public void eat() {
		
	}
	public void breath() {
		
	}


}
