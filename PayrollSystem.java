
import java.util.Calendar;

public class PayrollSystem {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		//System.out.println(month);
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("馬森",1002,new MyDate(1992, 2, 28),10000);
		emps[1] = new HourlyEmployee("潘雨生",2001,new MyDate(1991, 3, 6),60,240);
		
		for(int i = 0;i < emps.length;i++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("月工資為:" + salary);
			
			if((month+1) == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快樂!獎勵100元");
			}
		}
			
	}
}
