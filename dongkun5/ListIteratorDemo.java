package dongkun5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //還是比較常用普通迭代器
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("------------");
//
//        //反向遍歷
//        while(lit.hasPrevious()){
//            String s = lit.previous();
//            System.out.println(s);
//        }
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
            if(s.equals("world")){
                //list.add("javaee");
                lit.add("javaee");//差別通過迭代器add上面是容器集合add;
            }
        }
        System.out.println(list);

    }
}
