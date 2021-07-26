package dongkun;

import java.io.ObjectInputStream;

public class MethodTest {
    public static void main(String[] args) {
//        getMax();
        //變量調用
//        int a = 10;
//        int b = 20;
//        getMax(a,b);
        //常量調用
//        getMax(10,20);
//        int result = getMax(10,20);
//        System.out.println(result);
//        System.out.println(getMax(30,20));
    }

//    public static void getMax() {
//        int a = 10;
//        int b = 20;
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//    }
//    public static void getMax(int a,int b){
//        if(a>b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//    }
//    public static int getMax(int a,int b){
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
    public static boolean compare(int a,int b){
        return a == b;
    }
    public static boolean compare(byte a,byte b){
        return a == b;
    }
    public static boolean compare(short a,short b){
        return a == b;
    }
    public static boolean compare(long a,long b){
        return a == b;
    }
}
