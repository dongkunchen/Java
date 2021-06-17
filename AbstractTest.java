package com.atguigu.java;

public class AbstractTest {
	public static void main(String[] args) {
		
	}

}

abstract class Creature{
	public abstract void breath();
		
}

abstract class Person extends Creature{
	String name;
	int age;
	
	public Person(){
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
//	public void eat() {
//		System.out.println("人吃飯");
//	}
	public abstract void eat();//抽象方法
	
	public void walk() {
		System.out.println("人走路");
	}
	
}

class Student extends Person{
	
	
	
	public Student(String name,int age) {
		super(name,age);
	}
	public Student() {
		
	}
	
	public void eat() {
		System.out.println("學生多吃有營樣的食物");
	}
	public void breath() {
		System.out.println("學生應該呼吸新鮮的沒有霧霾的空氣");
	}
}


