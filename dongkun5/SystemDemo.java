package dongkun5;


public class SystemDemo {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗時: " + (end-start) +"毫秒");
    }
}