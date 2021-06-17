package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ","DD","MM","BB","GG","AA"};
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
//		for(int i = 0;i < arr.length / 2;i++) {
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		
//		}
//		for(int i = 0;i < arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		System.out.println();
		String dest = "BB";
		
		boolean isFlag = true;
		
		for(int i = 0;i < arr.length;i++) {
			if(dest.equals(arr[i])) {
				System.out.print("找到指定位置" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.print("沒找到");
		
		}
		
		
	}

}
