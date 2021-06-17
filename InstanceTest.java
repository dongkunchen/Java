
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.palyGame();
		
	}

}

class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("發送郵件");
	}
	
	public void palyGame() {
		System.out.println("玩遊戲");
	}
}
