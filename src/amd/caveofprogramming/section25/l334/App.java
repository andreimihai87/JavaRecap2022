package amd.caveofprogramming.section25.l334;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Integer, List<String>> classes = new LinkedHashMap<Integer, List<String>>();

        classes.put(5, new LinkedList<String>(List.of("Alex", "Mihai", "John", "Anna", "Emil")));
        classes.put(6, new LinkedList<String>(List.of("Bob", "Mihai", "Jijy", "Emy", "Ana")));
        classes.put(7, List.of("Tibi", "Anna", "Joe", "Mike", "Peter"));

        for (int c : classes.keySet()) {
            System.out.println("Class " + c + ":");
            for (String name : classes.get(c)) {
                System.out.print(name + " ");
            }
            System.out.println();
        }

        System.out.println();

        List<String> class5 = classes.get(5);
        for (String name : class5) {
            System.out.println(name);
        }

    }

}
