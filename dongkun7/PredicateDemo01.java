package dongkun7;

import java.util.function.Predicate;


public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello",s->s.length()>8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld",s->s.length()>8);
        System.out.println(b2);

    }

    private static boolean checkString(String s, Predicate<String> pre){
//        return pre.test(s);
//        return !pre.test(s);
        return pre.negate().test(s);
    }
}
