
public class USBTest {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1.創建了街口的非匿名子類實現類的非匿名對象
		Flash flash = new Flash();
		com.transferData(flash);
		//2.創建了街口的非匿名實現類的匿名對象
		com.transferData(new Printer());
		//3.創建了街口匿名實現類的非匿名對象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手機開始工作");
			}

			@Override
			public void stop() {
				System.out.println("手機結束工作");
			}
		
		
		};
		com.transferData(phone);
		
		//4.創建了街口匿名實現類的匿名對象
		com.transferData(new USB(){
			public void start() {
				System.out.println("mp3開始工作");
			}

			@Override
			public void stop() {
				System.out.println("mp3結束工作");
			}
		});
	}
}
class Computer{
	
	public void transferData(USB usb) {//USB usb = new Flash();
		usb.start();
		System.out.println("具體傳輸數據的細節");
		
		usb.stop();
	}
}

interface USB{
	
	void start();
	
	void stop();
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盤開啟工作");
		
	}

	@Override
	public void stop() {
		System.out.println("U盤結束工作");
		
	}
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印機開始工作");
		
	}

	@Override
	public void stop() {
		System.out.println("打印機結束工作");
		
	}
	
}
