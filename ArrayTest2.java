package com.atguigu.java;

public class ArrayTest2 {
	/**
	 * @Description
	 * @author DongKun-Chen
	 * @date 2021年2月27日下午12:31:15
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int[][] arr1 = new int [][] {{1,2,3},{4,5},{6,7,8}};
		String[][] arr2 = new String[3][2];
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		
	}
}
