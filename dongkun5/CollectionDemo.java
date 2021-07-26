package dongkun5;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionDemo {
    public static void main(String[] args){
        java.util.Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String> it = c.iterator();

//        for (;it.hasNext();){
//            System.out.println(it.next());
//        }

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
