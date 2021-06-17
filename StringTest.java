/*
String類型變量的使用
1.String屬於引用數據類型,翻譯為:字符串
2.聲明Sting類型變量時,使用一對""
*/

class StringTest{
	public static void main(String[] args){
		String s1 = "Hello World!";
		System.out.println(s1);
		String s2 = "a";
		String s3 = "";
		//char c = '';   
		//char不能空白一定一個字符
		//*******************
		int number = 10;
		String numberStr = "學號:";
		String info = numberStr + number;
		System.out.println(info);
		boolean b1 = true;
		String info1 =numberStr + b1;
		System.out.println(info1);
		//**************************
		//練習1
		char c = 'a'; //a=97 A=65 ASCII碼
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//llo10a
		//練習2
		System.out.println("*   *");
		System.out.println('*' + '\t' + '*');
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ('\t' + "*"));
		//練習3
		//String str1 = 4; 無法編譯
		String str2 = 3.5f + "";
		System.out.println(str2);
		System.out.println(3+4+"Hello!");//7Hello!
		System.out.println("Hello!"+3+4);//Hello!34
		System.out.println('a'+1+"Hello!");//98Hello!
		System.out.println("Hello"+'a'+1);//Helloa1
		
		//int num1 = str1; 無法編譯無法轉換
		//int numl = str1; 無法編譯無法強制傳換
		String str3 = "123";
		int num1 = Integer.parseInt(str3);
		System.out.println(num1);
		
	}
}