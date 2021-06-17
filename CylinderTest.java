package com.atguigu.exer1;

public class CylinderTest {
	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("圓柱體積 " + volume );
		double area = cy.findArea();
		System.out.println("圓底面積 " + area);
	}

}
