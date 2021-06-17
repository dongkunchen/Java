
public class BlockTest {
    public static void main(String[] args) {
		
    	String desc = Person.desc;
    	System.out.println(desc);
    	
    	Person p1 = new Person();
    	Person p2 = new Person();
    	System.out.println(p1.age);
    	
    	Person.info();
    	
	}
}


class Person{
	String name;
	int age;
	static String desc = "我是一個人";
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//靜態代碼塊,只加載一次
	static {
		System.out.println("hello,static block-1");
		desc = "我是一個愛學習的人";
		
	}
	static {
		System.out.println("hello,static block-2");
		
	}
	//非靜態代碼塊隨著new創建加載 每創建new就執行 可多次
	{
		System.out.println("hello,block");
		age = 1;//可以對象屬性初始化
		
	}
	
	public void eat() {
		System.out.println("吃飯");
		
	}
	public String toString() {
		return "Person [name=" + name + ", age" + age + "]";
	}
	public static void info() {
		System.out.println("我是一個快樂的人");
	}
}
