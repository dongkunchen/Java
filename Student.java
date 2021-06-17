package com.atguigu.java;

public class Student extends Person {
	String major;

	public Student() {
	}

	public Student(String major) {
		this.major = major;
	}
	public void study() {
		System.out.println("學習,專業是," + major);
	}
	//對重寫
	public void eat() {
		System.out.println("學生應該多吃有營養的食物");
	}

}
