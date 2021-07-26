package dongkun7;

import java.util.*;
import java.util.stream.Stream;


public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();

        String[] strArray = {"hello","world","java"};
        Stream<String> strArrayStream1 = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello","world","java");
        Stream<Integer> strArrayStream3 = Stream.of(10,20,30);
    }
}
