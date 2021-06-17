package com.atguigu.exer2;

public class Girl {
	private String name;
	private int age;
	
	public Girl() {
		
	}
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void marry(Boy boy) {
		System.out.println("我想嫁給" + boy.getName());
	}
	/**
	 * 
	 * @Description 比較兩個對象的大小
	 * @author DongKun-Chen
	 * @date 2021年2月28日下午11:59:10
	 * @param girl
	 * @return 正數:當前對象大 負數:當前對象小 0:兩對象相等
	 */
	public int compare(Girl girl) {
		return this.age - girl.age;
		
	}

}
