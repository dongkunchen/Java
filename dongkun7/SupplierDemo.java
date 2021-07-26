package dongkun7;

import java.util.function.Supplier;


public class SupplierDemo {
    public static void main(String[] args) {
//        String s = getString(()->{
//           return "林青霞";
//        });
        String s = getString(()-> "林青霞");
        System.out.println(s);

        Integer i = getInteger(()-> 30);
        System.out.println(i);
    }

    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
