class IfTest {
	public static void main(String[] arge) {
		//�|��1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("�ݭn�i�@�B�ˬd");
		}
		System.out.println("�ˬd����");
		
		//�|��2
		
		int age = 23;
		if(age < 18){
			System.out.println("�A�٥i�H�ݰʵe��");
		}else{
			System.out.println("�A�i�H�ݦ��H�q�v");
		}
		//�|��3
		if(age < 0){
			System.out.println("�A��J���ƾڿ��~");
		}else if(age < 18){
			System.out.println("�C�֦~�ɴ�");
		}else if(age < 35){
			System.out.println("�C���~�ɴ�");
		}else if(age < 60){
			System.out.println("���~�ɴ�");
		}else if(age < 120){
			System.out.println("�Ѧ~�ɴ�");
		}else{
			System.out.println("�A���P�F");
		}
	}
}