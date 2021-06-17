package com.atguigu.java2;

public class InnerClassTest1 {
	
	public void method() {
		class AA{
			
		}
	}
	
	
	public Comparable getComparable() {
		
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		}
//		return new MyComparable();
		//方式二:
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				return 0;
			}
			
		};
	}
}
