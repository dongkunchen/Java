package com.atguigu.java3;
//總結：由父及子，靜態先行
class Root{
	static{
		System.out.println("Root的靜態初始化塊");
	}
	{
		System.out.println("Root的普通初始化塊");
	}
	public Root(){
		super();
		System.out.println("Root的無參數的構造器");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid的靜態初始化塊");
	}
	{
		System.out.println("Mid的普通初始化塊");
	}
	public Mid(){
		super();
		System.out.println("Mid的無參數的構造器");
	}
	public Mid(String msg){
		//通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的帶參數構造器，其參數值："
			+ msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf的靜態初始化塊");
	}
	{
		System.out.println("Leaf的普通初始化塊");
	}	
	public Leaf(){
		//通过super调用父类中有一个字符串参数的构造器
		super("尚硅谷");
		System.out.println("Leaf的構造器");
	}
}
public class LeafTest{
	public static void main(String[] args){
		new Leaf(); 
		System.out.println();
		new Leaf();
	}
}

