package dongkun5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //System.out.println(list);

        //Iterator<String> it = list.iterator();

        //會產生併發修改異常ConcurrentModificationException
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//            if(s.equals("world")){
//                list.add("javaee");
//            }
//        }
        //改通過get遍歷
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
