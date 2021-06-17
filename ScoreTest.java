package com.atguigu.exer3;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Vector v = new Vector();
		
		int maxScore = 0;
		for(;;) {
			System.out.println("請輸入學生成績(以負數代表輸入結束)");
			int score = scan.nextInt();
			
			if(score < 0) {
				break;
			}
			if(score > 100) {
				System.out.println("輸入的數據錯誤,請重新輸入");
				continue;
			}
//			Integer inScore = new Integer(score);
//			v.addElement(inScore);
			v.addElement(score);//5.0後自動裝箱
			if(maxScore < score) {
				maxScore = score;
			}
			
		}
		for(int i = 0;i < v.size();i++) {
			Object obj = v.elementAt(i);
			
		}
		
		
	}

}
