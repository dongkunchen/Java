package com.atguigu.exer1;

public class EmployeeTest {
	public static void mian(String[] args) {
		
		Manager manager = new Manager("庫克", 1001, 5000, 50000);
		manager.work();
		
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
	}

}
