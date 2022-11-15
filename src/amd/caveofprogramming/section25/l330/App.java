package amd.caveofprogramming.section25.l330;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        // HashSet, LinkedHashSet, TreeSet
        // HashMap, LinkedHashMap, TreeMap

        LinkedHashMap<Integer, String> months = new LinkedHashMap<Integer, String>();
        months.put(1, "Jan");
        months.put(6, "Jun");
        months.put(3, "Mar");

        months.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println();
        
        TreeMap<Integer, String> months2 = new TreeMap<Integer, String>();
        months2.put(1, "Jan");
        months2.put(6, "Jun");
        months2.put(3, "Mar");
        
        months2.forEach((k, v) -> System.out.println(k + ": " + v));
    }

}
