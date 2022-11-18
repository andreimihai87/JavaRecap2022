package amd.caveofprogramming.section28.l353;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> list = List.of("one", "two", "three");

        list.forEach((s) -> {
            System.out.println(s);
        });

    }

}
