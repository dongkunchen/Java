package dongkun2;
import java.util.ArrayList;


public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<String>();

        array.add("劉正風");
        array.add("左冷禪");
        array.add("風清揚");

        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
