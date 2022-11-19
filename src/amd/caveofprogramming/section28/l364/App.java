package amd.caveofprogramming.section28.l364;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<Integer>(List.of(1, 2, 3, 6, 7, 8));

        numberList.replaceAll(n -> n * n);
        numberList.forEach(n -> System.out.println(n));
        
        System.out.println();

        var stringList = new ArrayList<String>(List.of("Mike", "Joe", "Sue", "Giles"));

        stringList.replaceAll(s -> s.toUpperCase());
        stringList.forEach(System.out::println);
        
        System.out.println();
        stringList.replaceAll(s -> "Hello " + s);
        stringList.forEach(System.out::println);

    }

}
