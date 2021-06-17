package com.atguigu.exer;

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle(3.3, "white", 1.0);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle(3.3, "white", 1.0);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		System.out.println("c1 和 c2 的面積是否相等：" + isEquals);
		
		MyRectangle rect = new MyRectangle(2.1, 3.4, "red", 2.0);
		test.displayGeometricObject(rect);
		
	}
	
	public void displayGeometricObject(GeometricObject o){//GeometricObject o = new Circle(...)
		System.out.println("面積為：" + o.findArea());
	}
	
	//測試兩對象面積是否相等
	public boolean equalsArea(GeometricObject o1,GeometricObject o2){
		return o1.findArea() == o2.findArea();
	}
}
