package amd.caveofprogramming.section30.l393;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

// Using streams:
// Load a text file.
// Create a map of all the words in the text file,
// where the keys in the map are words
// and the values are a count of the number of times each word occurs in the
// file.

public class App {

    public static void main(String[] args) throws IOException {

        // @formatter:off
        TreeMap<String, Integer> mapWords = Files.lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]"))
                .map(list -> Arrays.asList(list))
                .flatMap(list -> list.stream())
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(() -> new TreeMap<String, Integer>(), App::accumulate, App::combine);
        
        for (var entry : mapWords.entrySet()) {
            System.out.printf("%-12s : %-2s\n", entry.getKey(), entry.getValue());
        }

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
    
    private static void accumulate(Map<String, Integer> map, String word) {
        Integer count1 = map.get(word);
        if (count1 == null) {
            map.put(word, 1);
        }
        else {
            map.put(word, count1 + 1);
        }
    }

}
