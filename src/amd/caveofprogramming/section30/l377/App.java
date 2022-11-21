package amd.caveofprogramming.section30.l377;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 3, 4, 6, 7, 9));

        numbers.stream().forEach(System.out::println);

        System.out.println();

        numbers.stream().forEach(n -> System.out.println(n));

    }

}
