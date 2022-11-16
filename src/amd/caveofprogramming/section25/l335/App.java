package amd.caveofprogramming.section25.l335;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // set of sets
        Set<Set<String>> setOfSets = new HashSet<>();

        Set<String> item = new TreeSet<>();
        setOfSets.add(item);
        item.add("test1");
        item.add("taxi");

        setOfSets.add(new TreeSet<>(Set.of("house", "casa")));

        for (Set<String> set : setOfSets) {
            for (String name : set) {
                System.out.print(name);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
