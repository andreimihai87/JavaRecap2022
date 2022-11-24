package amd.caveofprogramming.section30.l391;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>(Map.of("one", 1, "two", 2));
        Map<String, Integer> map2 = new HashMap<>(Map.of("two", 1, "three", 3, "four", 4));
        
        combine(map1, map2);
        
        System.out.println(map1);

    }

    private static void combine(Map<String, Integer> map1, Map<String, Integer> map2) {

        map2.forEach((word, count2) -> {

            Integer count1 = map1.get(word);

            if (count1 == null) {
                map1.put(word, count2);
            }
            else {
                map1.put(word, count1 + count2);
            }

        });

    }

}
