package com.atguigu.java;

public class PersonTest {
	public static void main(String[] args) {
		//創建類的對象
		Person p1 =  new Person();
		//調用對象的結構:屬性 方法
		//調用屬性:"對象.屬性"
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		//調用:對象.方法
		p1.eat();
		p1.sleep();
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
	}
}


class Person{
	//屬性
	String name;
	int age = 1;
	boolean isMale;
	//方法
	public void eat() {
		System.out.println("人可以吃飯");
	}
	
	public void sleep() {
		System.out.println("人可以睡覺");
	}
	
}
	
	
