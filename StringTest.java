/*
String�����ܶq���ϥ�
1.String�ݩ�ޥμƾ�����,½Ķ��:�r�Ŧ�
2.�n��Sting�����ܶq��,�ϥΤ@��""
*/

class StringTest{
	public static void main(String[] args){
		String s1 = "Hello World!";
		System.out.println(s1);
		String s2 = "a";
		String s3 = "";
		//char c = '';   
		//char����ťդ@�w�@�Ӧr��
		//*******************
		int number = 10;
		String numberStr = "�Ǹ�:";
		String info = numberStr + number;
		System.out.println(info);
		boolean b1 = true;
		String info1 =numberStr + b1;
		System.out.println(info1);
		//**************************
		//�m��1
		char c = 'a'; //a=97 A=65 ASCII�X
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//llo10a
		//�m��2
		System.out.println("*   *");
		System.out.println('*' + '\t' + '*');
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ('\t' + "*"));
		//�m��3
		//String str1 = 4; �L�k�sĶ
		String str2 = 3.5f + "";
		System.out.println(str2);
		System.out.println(3+4+"Hello!");//7Hello!
		System.out.println("Hello!"+3+4);//Hello!34
		System.out.println('a'+1+"Hello!");//98Hello!
		System.out.println("Hello"+'a'+1);//Helloa1
		
		//int num1 = str1; �L�k�sĶ�L�k�ഫ
		//int numl = str1; �L�k�sĶ�L�k�j��Ǵ�
		String str3 = "123";
		int num1 = Integer.parseInt(str3);
		System.out.println(num1);
		
	}
}