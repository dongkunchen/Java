package com.atguigu.exer2;

public class CheckAccount extends Account {
	
	private double overdraft;
	
	public CheckAccount(int id,double balance,double annualInterestRate,double overdraft) {
		super(id,balance,annualInterestRate);
		this.overdraft = overdraft;
	}
	public void withdraw(double amount) {
		if(getBalance() >= amount) {
			//setbalance(getbalance() - amount);
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()) {
			overdraft -= (amount - getBalance());
			setBalance(0);
		}else {
			System.out.println("超過可透支限額!");
		}
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
}
