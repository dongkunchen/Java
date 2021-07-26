package dongkun7;

import java.util.ArrayList;


public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("張曼玉");
        list.add("王祖賢");
        list.add("柳岩");
        list.add("張敏");
        list.add("張無忌");

        ArrayList<String> zhangList = new ArrayList<String>();
        for (String s:list){
            if(s.startsWith("張")){
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);

        ArrayList<String> threeList = new ArrayList<String>();
        for (String s:zhangList){
            if (s.length()==3){
                threeList.add(s);
            }
        }

        for (String s:threeList){
            System.out.println(s);
        }
        System.out.println("-----採用stream流------");
        list.stream().filter(s->s.startsWith("張")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("張")).filter(s->s.length()==3).forEach(System.out::println);

    }
}
