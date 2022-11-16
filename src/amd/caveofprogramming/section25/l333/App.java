package amd.caveofprogramming.section25.l333;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<Set<String>> dailyTasks = new ArrayList<Set<String>>();

        dailyTasks.add(new HashSet<String>(Set.of("walk", "read", "dance")));
        dailyTasks.add(new HashSet<String>(Set.of("walk", "study", "run")));

        for (Set<String> set : dailyTasks) {
            for (String task : set) {
                System.out.print(task + " ");
            }
            System.out.println();
        }

        Set<String> firstSet = dailyTasks.get(0);

        System.out.println();
        for (String task : firstSet) {
            System.out.println(task);
        }

    }

}
