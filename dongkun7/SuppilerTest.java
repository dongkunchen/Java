package dongkun7;

import java.util.function.Supplier;


public class SuppilerTest {
    public static void main(String[] args) {
        int[] arr = {130,50,60,70,90,110};
        int maxValue =getMax(()->{
           int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]> max){
                 max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
