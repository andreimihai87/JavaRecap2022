package amd.caveofprogramming.section30.l399to401;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 1    2   3   4 ....
 * 2    4   6   8 ....
 * 3    6   9   12 ....
 * ....
 * 12   24  36  .... 144
 */

public class App {

    public static void main(String[] args) {

        // v1
        IntStream.range(1, 13).forEach(n -> {
            IntStream.range(1, 13).forEach(k -> {
                System.out.printf("%3d ", n * k);
            });
            System.out.println();
        });
        
        System.out.println();

        // v2
        var table = IntStream.range(1, 13).mapToObj(n -> {
            return IntStream.range(1, 13).map(k -> k * n).mapToObj(Integer::toString).map(s -> String.format("%4s", s))
                    .collect(Collectors.joining());
        }).collect(Collectors.joining("\n"));

        System.out.println(table);

    }

}
