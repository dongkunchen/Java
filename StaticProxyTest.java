

public class StaticProxyTest {

	public static void main(String[] args) {
		Proxy s = new Proxy(new RealStar());
		s.confer();
		s.signContract();
		s.bookTicket();
		s.sing();
		s.collectMoney();
	}
}

interface Star {
	void confer();// 面談

	void signContract();// 簽合同

	void bookTicket();// 訂票

	void sing();// 唱歌

	void collectMoney();// 收錢
}
//被代理類
class RealStar implements Star {

	public void confer() {
	}

	public void signContract() {
	}

	public void bookTicket() {
	}

	public void sing() {
		System.out.println("明星：唱歌~~~");
	}

	public void collectMoney() {
	}
}

//代理類
class Proxy implements Star {
	private Star real;

	public Proxy(Star real) {
		this.real = real;
	}

	public void confer() {
		System.out.println("經紀人面談");
	}

	public void signContract() {
		System.out.println("經紀人簽合同");
	}

	public void bookTicket() {
		System.out.println("經紀人訂票");
	}

	public void sing() {
		real.sing();
	}

	public void collectMoney() {
		System.out.println("經紀人收錢");
	}
}
