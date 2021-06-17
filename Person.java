
public class Person {
	
	private int age;
	private String name;
	
	public Person(String n ,int a) {
		age = a;
		name = n;
	}

	public void setAge(int a) {
		if(a < 0 || a > 130) {
			System.out.println("傳入的數據非法!");
			return;
		}
		
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}
