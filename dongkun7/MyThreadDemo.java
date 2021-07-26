package dongkun7;


public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //my1.run();//非啟動線程只是調用方法
        //啟動線程
        my1.start();
        my2.start();
    }
}
