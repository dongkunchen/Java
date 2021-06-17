package com.atguigu.exer2;

public class AcountTest {
	public static void main(String[] args) {
		
		Account acct = new Account(1122, 20000 , 0.045);
		acct.withdraw(30000);
		System.out.println("你的帳戶餘額為:" + acct.getBalance());
		acct.withdraw(2500);
		System.out.println("你的帳戶餘額為:" + acct.getBalance());
		acct.deposit(3000);
		System.out.println("你的帳戶餘額為:" + acct.getBalance());
		
		System.out.println("月利率為:" + (acct.getMonthlyInterest() * 100) + "%");
	}

}
