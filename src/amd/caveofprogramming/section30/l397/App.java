package amd.caveofprogramming.section30.l397;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

// Using streams:
// Load a text file.
// Create a map of all the words in the text file,
// where the keys in the map are words
// and the values are a count of the number of times each word occurs in the
// file.

public class App {

    public static void main(String[] args) throws IOException {

        // @formatter:off
        var mapWords = Files.lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]"))
                .map(list -> Arrays.asList(list))
                .flatMap(list -> list.stream())
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(groupingBy(word -> word, counting()));
        // @formatter:on

        var list = mapWords.entrySet().stream().sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                .collect(toList());

        for (int i = 0; i < list.size(); i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%-11s : %4d | ", list.get(i).getKey(), list.get(i).getValue());
        }

    }

}
