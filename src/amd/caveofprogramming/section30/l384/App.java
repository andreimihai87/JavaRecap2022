package amd.caveofprogramming.section30.l384;

import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<Set<Integer>> listOfSets = List.of(Set.of(1, 2, 3), Set.of(4, 5, 6), Set.of(7, 8, 9));

        listOfSets.stream()
            .flatMap(s -> s.stream())
            .forEach(System.out::println);

    }

}
