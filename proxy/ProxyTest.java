package tw.dongkun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyTest {
    public static void main(String[] args){
        //1.創建真實對象
        Asus asus = new Asus();

        //2.動態代理增強asus對象(固定寫法)
        /*
        三個參數固定:
        1.類加載器:真實對象.getClass().getClassLoader()
        2.接口數組:真實對象.getClass().getInterfaces()
        3.處理器:new InvocationHandler() 匿名實現
        4.返回一個代理對象類型(object)
        5.強轉
         */
        SaleComputer proxy_asus = (SaleComputer)Proxy.newProxyInstance(asus.getClass().getClassLoader(), asus.getClass().getInterfaces(), new InvocationHandler() {

            /**
             * 代理邏輯編寫的方法:代理對象調用的所有方法都會觸發該方法執行
             * 三個參數
             * 1.proxy:代理對象
             * 2.method:代理對象調用的方法被封裝的對象
             * 3.args:代理調用的方法時,傳遞的實際參數
             * 用途:
             * 1.增強參數
             * 2.增強方法
             * 3.增強返回值
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("代理方法執行了");
//                System.out.println(method.getName());
//                System.out.println(args[0]);
                //使用真實對象調用該方法
                //判斷是否是sale的方法
                if(method.getName().equals("sale")){
                    //1.增強參數
//                    double money = (double) args[0];
//                    money = money *0.85;
//                    String obj = (String) method.invoke(asus,money);
                    //2.增強方法
                    double money = (double) args[0];
                    money = money *0.85;//增強參數
                    System.out.println("專車接你");//增強方法
                    String obj = (String) method.invoke(asus,money);//增強參數
                    System.out.println("免費送貨");//增強方法

                    //3.增強返回值
                    return obj+"_滑鼠";

                }else{
                    Object obj = method.invoke(asus, args);
                    return obj;
                }
            }
        });

        //2.調用方法
        //String computer = asus.sale(30000);
        String computer = proxy_asus.sale(30000);
        System.out.println(computer);

//        proxy_asus.show();
    }
}
