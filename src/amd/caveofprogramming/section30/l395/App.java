package amd.caveofprogramming.section30.l395;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Using streams:
// Load a text file.
// Create a map of all the words in the text file,
// where the keys in the map are words
// and the values are a count of the number of times each word occurs in the
// file.

class MyMap extends TreeMap<String, Integer> {

    private static final long serialVersionUID = 1L;

    public void putWordOrAdd(String key, int count2) {
        Integer count1 = get(key);

        if (count1 == null) {
            put(key, count2);
        }
        else {
            put(key, count1 + count2);
        }

    }

}

public class App {

    public static void main(String[] args) throws IOException {

        // @formatter:off
        TreeMap<String, Integer> mapWords = Files.lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]"))
                .map(list -> Arrays.asList(list))
                .flatMap(list -> list.stream())
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(MyMap::new, App::accumulate, App::combine);
        // @formatter:on

        var list = mapWords.entrySet().stream().sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%-11s : %4d | ", list.get(i).getKey(), list.get(i).getValue());
        }

    }

    private static void combine(MyMap map1, Map<String, Integer> map2) {
        map2.forEach((word, count2) -> {
            map1.putWordOrAdd(word, count2);
        });
    }

    private static void accumulate(MyMap map, String word) {
        map.putWordOrAdd(word, 1);
    }

}
