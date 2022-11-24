package amd.caveofprogramming.section30.l390and392;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Using streams:
// Load a text file.
// Create a map of all the words in the text file,
// where the keys in the map are words
// and the values are a count of the number of times each word occurs in the
// file.

public class App {

    public static void main(String[] args) throws IOException {

//        Map<String, Integer> mapWords = new TreeMap<String, Integer>();
//
//        // @formatter:off
//        List<String> wordList = Files.lines(Paths.get("1984.txt"))
//                .map(s -> s.split("[^a-zA-Z]+"))
//                .map(list -> Arrays.asList(list))
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toList());
//        // @formatter:on
        
        // @formatter:off
        HashMap<String, Integer> mapWords = Files.lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]+"))
                .map(list -> Arrays.asList(list))
                .flatMap(list -> list.stream())
                .collect(
                        () -> new HashMap<String, Integer>(),
                        (map, word) -> {
                            Integer count1 = map.get(word);
                            if (count1 == null) {
                                map.put(word, 1);
                            }
                            else {
                                map.put(word, count1 + 1);
                            }
                        },
                        App::combine);
        // @formatter:on

//        System.out.println(wordList);
//
//        for (String word : wordList) {
//            int count = 1;
//            if (mapWords.containsKey(word)) {
//                count = mapWords.get(word);
//                count++;
//            }
//            mapWords.put(word, count);
//        }
        
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

}
