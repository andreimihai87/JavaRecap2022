package amd.caveofprogramming.section30.l389;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<String> myList = Stream.of("one", "two", "three", "four").collect(Collectors.toList());
        System.out.println(myList);
        
        System.out.println();
        
        ArrayList<String> arrayList = Stream.of("one", "two", "three", "four").collect(
                                () -> new ArrayList<String>(),
                                (list, item) -> list.add(item),
                                (list1, list2) -> list1.addAll(list2)
                          );
        System.out.println(arrayList);
    }

}
