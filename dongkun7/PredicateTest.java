package dongkun7;

import java.util.ArrayList;
import java.util.function.Predicate;


public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30","柳岩,34","張曼玉,35","貂蟬,31","王祖賢,33"};
        ArrayList<String> array = myFilter(strArray,s -> s.split(",")[0].length()>2,s->Integer.parseInt(s.split(",")[1])>33);
        for (String str : array) {
            System.out.println(str);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> array = new ArrayList<String>();
        for (String str:strArray){
            if(pre1.and(pre2).test(str)){
                array.add(str);
            }
        }
        return array;
    }
}
