
public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("羅密歐", 21);
		boy.shout();
		
		Girl girl = new Girl("茱麗葉", 18);
		girl.marry(boy);
		
	}

}
