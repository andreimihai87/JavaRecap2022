package amd.caveofprogramming.section30.l385;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Obtain a text file from Project Gutenberg (or anywhere else).
// Using streams, create a list of all words in the text file.

// Tips:
// First read the file using the Files class.
// Split each line into an array of strings (words)
// Transform the arrays of strings into lists of strings: use Arrays.asList()
// Flatten the data structure
// Collect the final stream together into a list.

public class App {

    public static void main(String[] args) throws IOException {

//        My version
//        String book = Files.readString(Paths.get("1984.txt"));
//        String[] words = book.split("[^a-zA-Z]+");
//        List<String> list = Arrays.asList(words);
//        list.forEach(System.out::println);

        // @formatter:off
        List<String> words = Files
                .lines(Paths.get("1984.txt"))
                .map(s -> s.split("[^a-zA-Z]+"))
                .map(a -> Arrays.asList(a))
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
        // @formatter:on

        int count = 1;
        for (String word : words) {
            System.out.printf("%-10s", word);
            if (count++ % 10 == 0) {
                System.out.println();
            }
        }

    }

}
