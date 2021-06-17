package com.atguigu.java2;

public class InnerClassTest {
	public static void main(String[] args) {
		
		Person.Dog dog = new Person.Dog();
		dog.show();
		
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.sing();
		
		bird.display("黃鸝");
		
	}

}

class Person{
	String name = "小明";
	int age;
	public void eat() {
		System.out.println("人,吃飯");
	}
	
	//靜態成員內部類
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("卡拉是條狗");
		}
	}
	
	//非靜態成員內部類
	class Bird{
		String name = "杜鵑";		
		public void sing() {
			System.out.println("我是一隻小小鳥");
			eat();//可省略了Person.this.
		}
		
		public void display(String name) {
			System.out.println(name);//方法的形參
			System.out.println(this.name);//內部類屬性
			System.out.println(Person.this.name);//外部類屬性
		}
		
	}
	
	
	public void method() {
		
		class AA{
		
		}
    }
	{
		class BB{
			
		}
    }
	
	public Person() {
		class CC{
			
		}
	}
}