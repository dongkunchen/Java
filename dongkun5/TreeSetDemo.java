package dongkun5;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
