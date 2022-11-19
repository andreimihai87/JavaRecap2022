package amd.caveofprogramming.section28.l362;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 7, 8, 9, 1, 5));

        numbers.removeIf(n -> n < 5);
        numbers.forEach(System.out::println);
        
        System.out.println();

        List<String> words = new ArrayList<String>(List.of("one", "two", "three", "four", "five"));

        words.removeIf(s -> s.charAt(0) == 'f');
        words.forEach(s -> System.out.println(s));

    }

}
