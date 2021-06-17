class VariableTest1{
	public static void main(String[] args){
		byte b1 = 12;
		byte b2 = -128;
		System.out.println(b1);
		System.out.println(b2);
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3414234324L;
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		double d1 = 123.3;
		System.out.println(d1 + 1);
		float f1 = 12.3F;
		System.out.println(f1);
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '1';
		System.out.println(c2);
		char c3 = '¤¤';
		System.out.println(c3);
		char c4 = '\n';
		System.out.println("Hello" + c4 + "World"); 
		System.out.print("Hello");
		System.out.println("World");
		char c6 = '\u0043';
		System.out.println(c6);
	}
}