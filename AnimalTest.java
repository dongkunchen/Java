
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黃";
		a.setLegs(6);
		
		a.show();
		
		//System.out.println(a.getLegs());
		
	}

}

class Animal {
	
	String name;
	int age;
	private int legs;
	
	public void setLegs(int l){
		if(l > 0 && l % 2 == 0) {
			legs = l;
		}else {
			legs = 0;
		}
	}
	public int getLegs(){
		return legs;
	}
	public void show(){
		System.out.println(legs);
		
	}
}
