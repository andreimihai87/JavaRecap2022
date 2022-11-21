package amd.caveofprogramming.section30.l378;

import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Stream.of(1, 4, 7, 9).forEach(System.out::println);

        System.out.println();

        // infinite stream
        // Stream.generate(() -> "Hello").forEach(System.out::println);

        Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);

        System.out.println();

        List.of(1, 3, 5).stream().forEach(System.out::println);

    }

}
